package Priti.com.project.todo_application.mvvm_model;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.Date;


@Database(entities = {Todo.class},version = 1)
@TypeConverters(DateConversion.class)
public abstract class DB extends RoomDatabase {

    private static DB instance;
    public abstract TodoDao noteDao();
    public static synchronized DB getInstance(Context context){
        if(instance==null){
            instance= Room.databaseBuilder(context.getApplicationContext(),
                    DB.class, "note_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build();

        }
        return instance;


    }


    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(instance).execute();
        }
    };

    private static class PopulateDbAsyncTask extends AsyncTask<Void,Void,Void>{
        private TodoDao noteDao;
        private PopulateDbAsyncTask(DB db){
            noteDao =db.noteDao();
        }






        @Override
        protected Void doInBackground(Void... voids) {

           noteDao.insert(new Todo("Titel 2", "description1",2,(new Date(2020,1,30))));
           noteDao.insert(new Todo("Titel 3", "description1",3,(new Date(2020,1,30))));
            return null;
        }
    }











}
