// so we can use keywords from Android, such as 'Android' and 'proguardOptions'
import android.Keys._

// load the android plugin into the build
android.Plugin.androidBuild

// project name, completely optional
name := "Scratch"

// pick the version of scala you want to use
scalaVersion := "2.10.2"

// scala 2.10 flag for feature warnings
scalacOptions in Compile += "-feature"

// for non-ant-based projects, you'll need this for the specific build target:
platformTarget in Android := "android-17"

// call install and run without having to prefix with android:
run <<= run in Android

install <<= install in Android