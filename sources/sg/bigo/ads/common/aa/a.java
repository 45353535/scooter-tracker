package sg.bigo.ads.common.aa;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f102263a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f102264b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f102265c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f102266d;

    /* JADX INFO: renamed from: sg.bigo.ads.common.aa.a$a, reason: collision with other inner class name */
    final class C1254a implements FileFilter {
        C1254a() {
        }

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i10 = 3; i10 < name.length(); i10++) {
                if (!Character.isDigit(name.charAt(i10))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int a() {
        if (f102263a) {
            return f102265c;
        }
        int iA = sg.bigo.ads.common.x.a.a();
        f102265c = iA;
        if (iA != 0) {
            f102263a = true;
            return iA;
        }
        try {
            f102265c = new File("/sys/devices/system/cpu/").listFiles(new C1254a()).length;
        } catch (Throwable unused) {
        }
        if (f102265c <= 1) {
            f102265c = Runtime.getRuntime().availableProcessors();
        }
        f102263a = true;
        sg.bigo.ads.common.x.a.a(f102265c);
        return f102265c;
    }

    public static long b() {
        if (f102264b) {
            long j10 = f102266d;
            if (j10 != 0) {
                return j10;
            }
        }
        long jB = sg.bigo.ads.common.x.a.b();
        f102266d = jB;
        if (jB != 0) {
            f102264b = true;
            return jB;
        }
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < a(); i12++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i13 = 0;
                        while (Character.isDigit(bArr[i13]) && i13 < 128) {
                            i13++;
                        }
                        int i14 = Integer.parseInt(new String(bArr, 0, i13));
                        if (i14 > i11) {
                            i11 = i14;
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th2) {
                        fileInputStream.close();
                        throw th2;
                    }
                    fileInputStream.close();
                }
            } catch (Exception unused2) {
            }
        }
        if (i11 == -1) {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    String[] strArrSplit = line.split(StringUtils.PROCESS_POSTFIX_DELIMITER, 2);
                    if ("cpu MHz".equals(strArrSplit[0].replaceAll("[\\t\\n\\r]", ""))) {
                        int i15 = (strArrSplit[1].contains(".") ? (int) Double.parseDouble(strArrSplit[1]) : Integer.parseInt(strArrSplit[1])) * 1000;
                        if (i15 > i11) {
                            i11 = i15;
                        }
                    }
                } catch (Exception unused3) {
                } catch (Throwable th3) {
                    fileReader.close();
                    bufferedReader.close();
                    throw th3;
                }
            }
            fileReader.close();
            bufferedReader.close();
        }
        i10 = i11;
        f102264b = true;
        long j11 = i10 / 1000;
        f102266d = j11;
        sg.bigo.ads.common.x.a.a(j11);
        return f102266d;
    }
}
