package name.lkk.cpdaily;

import android.os.Handler;
import android.os.Message;
import java.text.SimpleDateFormat;
import java.util.Date;

public class qrcoded {

    private Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    binding.time.setText("当前时间:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));
                    break;
            }
            return false;
        }
    });
}