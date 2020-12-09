package com.junegaming.ghostdk.util;

import android.util.Log;

public final class Logger {
    private static boolean debugMode = true;

    public static int d(String paramString) {
        int i = 0;
        if (isDebug()) {
            String[] arrayOfString = paramString.split("\\|");
            i = Log.d(arrayOfString[0], arrayOfString[1]);
        }
        return i;
    }

    public static int d(String paramString1, String paramString2) {
        return isDebug() ? Log.d(paramString1, paramString2) : 0;
    }

    public static int d(String paramString1, String paramString2, Throwable paramThrowable) {
        return isDebug() ? Log.d(paramString1, paramString2, paramThrowable) : 0;
    }

    public static int e(String paramString1, String paramString2) {
        try {
            return Log.e(paramString1, paramString2);
        } catch (Throwable throwable) {
            return 0;
        }
    }

    public static int e(String paramString1, String paramString2, Throwable paramThrowable) {
        try {
            return Log.e(paramString1, paramString2, paramThrowable);
        } catch (Throwable throwable) {
            return 0;
        }
    }

    public static int i(String paramString1, String paramString2) {
        return Log.i(paramString1, paramString2);
    }

    public static int i(String paramString1, String paramString2, Throwable paramThrowable) {
        return Log.i(paramString1, paramString2, paramThrowable);
    }

    private static boolean isDebug() {
        return (debugMode);
    }

    public static void printStackTrace() {
        StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
        int j = arrayOfStackTraceElement.length;
        for (int i = 0; i < j; i++)
            Log.d("StackTrace", arrayOfStackTraceElement[i].toString());
    }

    public static void setDebugMode(boolean paramBoolean) {
        debugMode = paramBoolean;
    }

    public static int v(String paramString1, String paramString2) {
        return isDebug() ? Log.v(paramString1, paramString2) : 0;
    }

    public static int v(String paramString1, String paramString2, Throwable paramThrowable) {
        return isDebug() ? Log.v(paramString1, paramString2, paramThrowable) : 0;
    }

    public static int w(String paramString1, String paramString2) {
        return Log.w(paramString1, paramString2);
    }

    public static int w(String paramString1, String paramString2, Throwable paramThrowable) {
        return Log.w(paramString1, paramString2, paramThrowable);
    }

    public static int w(String paramString, Throwable paramThrowable) {
        return Log.w(paramString, paramThrowable);
    }
}
