package com.taurusx.tax.g;

import android.content.Context;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class y {
    public static String z(Context context, String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(context.getAssets().open(str));
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = bufferedInputStream2.read(bArr);
                        if (i10 <= 0) {
                            break;
                        }
                        bufferedInputStream = null;
                        byteArrayOutputStream.write(bArr, 0, i10);
                    }
                    z(bufferedInputStream2);
                } catch (Error e10) {
                    e = e10;
                    bufferedInputStream = bufferedInputStream2;
                    Log.e("AssetsUtil", "IOException :" + e.getMessage());
                    z(bufferedInputStream);
                } catch (Exception e11) {
                    e = e11;
                    bufferedInputStream = bufferedInputStream2;
                    Log.e("AssetsUtil", "IOException :" + e.getMessage());
                    z(bufferedInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    z(bufferedInputStream);
                    throw th;
                }
            } catch (Error e12) {
                e = e12;
            } catch (Exception e13) {
                e = e13;
            }
            return byteArrayOutputStream.toString();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void z(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Error | Exception unused) {
        }
    }

    public static String z(String str, String str2) throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            try {
                File file = new File(str, str2);
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line != null) {
                            sb2.append(line);
                            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                        } else {
                            String string = sb2.toString();
                            try {
                                bufferedReader2.close();
                                return string;
                            } catch (IOException e10) {
                                e10.printStackTrace();
                                return string;
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        bufferedReader = bufferedReader2;
                        e.printStackTrace();
                        if (bufferedReader == null) {
                            return "";
                        }
                        try {
                            bufferedReader.close();
                            return "";
                        } catch (IOException e12) {
                            e12.printStackTrace();
                            return "";
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e13) {
                                e13.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e14) {
            e = e14;
        }
    }
}
