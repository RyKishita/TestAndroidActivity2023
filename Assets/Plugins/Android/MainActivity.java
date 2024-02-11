package com.rykishita.TestAndroidActivity2023;
import com.unity3d.player.UnityPlayerActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends UnityPlayerActivity {
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.d("OverrideActivity", "onCreate");
  }
  public void onBackPressed()
  {
    // UnityPlayerActivity.onBackPressed() を呼び出す代わりに、この例はバックボタンのイベントを無視します
    // super.onBackPressed();
  }

  @Override
  protected void onPause() {
    super.onPause();
    Log.d("OverrideActivity", "onPause");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.d("OverrideActivity", "onResume");
  }

  @Override
  protected void onDestroy() {
    Log.d("OverrideActivity", "onDestroy");
    super.onDestroy();
  }

  public int test(String arg) {
    Log.d("test", arg);
    return 1;
  }
}
