package day01.nguyenntt.mymusic;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyMusicService extends Service {
    MediaPlayer mo_obj;

    public MyMusicService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
//        throw new UnsupportedOperationException("Not yet implemented");
        return null;
    }

    @Override
    public void onCreate() {
        mo_obj = MediaPlayer.create(getApplicationContext(), R.raw.music);
        super.onCreate();
    }

    @SuppressLint("WrongConstant")
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
//        return super.onStartCommand(intent, flags, startId);
        mo_obj.start();
        return 0;
    }

    @Override
    public void onDestroy() {
//        super.onDestroy();
        mo_obj.release();
        super.onDestroy();
    }
}
