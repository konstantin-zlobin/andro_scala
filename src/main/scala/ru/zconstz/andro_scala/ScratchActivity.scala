package ru.zconstz.andro_scala

import _root_.android.app.Activity
import _root_.android.os.Bundle

class ScratchActivity extends Activity {

  override def onCreate(savedInstanceState : Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)
  }



}