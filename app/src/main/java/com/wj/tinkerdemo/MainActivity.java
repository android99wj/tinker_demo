package com.wj.tinkerdemo;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.tencent.tinker.lib.tinker.TinkerInstaller;
import com.wj.tinker.R;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    /**
     * 初始化界面
     */
    private void initView() {
        context = this;
        textView = (TextView) findViewById(R.id.main_tv);
    }

    /**
     * 点击按钮 加载patch
     *
     * @param view
     */
    public void loadPatch(View view) {
        TinkerInstaller.onReceiveUpgradePatch(context,
                Environment.getExternalStorageDirectory().getAbsolutePath() + "/patch_signed.apk");
    }
}
