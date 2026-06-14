package io.bidmachine;

import android.content.Context;
import android.media.AudioManager;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.RandomAccessFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public class DeviceInfo {
    private static final String OS_NAME = "android";
    private static volatile DeviceInfo instance;

    @NonNull
    private final y3 cache;

    @NonNull
    private final b cpu;

    @NonNull
    private final c gpu;

    @Nullable
    private String hwv;

    @Nullable
    private Boolean isRooted;
    public final boolean isTablet;

    @Nullable
    public final String manufacturer;

    @Nullable
    public final String model;

    @NonNull
    public final String osName;

    @NonNull
    public final String osVersion;

    @Nullable
    public final String phoneCarrier;

    @Nullable
    public final String phoneMCCMNC;
    public final float screenDensity;
    public final int screenDpi;

    @Nullable
    private Long totalDiskSpaceInMB;

    @NonNull
    private final a audio = new a();

    @NonNull
    private final d ram = new d();

    static final class a {
        a() {
        }

        private AudioManager a(Context context) {
            return (AudioManager) context.getSystemService("audio");
        }

        Float b(Context context) {
            AudioManager audioManagerA = a(context);
            if (audioManagerA == null) {
                return null;
            }
            int streamVolume = audioManagerA.getStreamVolume(3);
            int streamMaxVolume = audioManagerA.getStreamMaxVolume(3) - (Build.VERSION.SDK_INT >= 28 ? audioManagerA.getStreamMinVolume(3) : 0);
            return streamMaxVolume == 0 ? Float.valueOf(0.0f) : Float.valueOf((streamVolume - r6) / streamMaxVolume);
        }

        Boolean c(Context context) {
            AudioManager audioManagerA = a(context);
            if (audioManagerA == null) {
                return null;
            }
            int ringerMode = audioManagerA.getRingerMode();
            boolean z10 = true;
            if (ringerMode != 0 && ringerMode != 1) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y3 f79136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f79137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f79138c;

        b(y3 y3Var) {
            this.f79136a = y3Var;
        }

        private void a() throws Throwable {
            e();
            if (TextUtils.isEmpty(this.f79137b)) {
                this.f79137b = Build.BOARD;
            }
            if (TextUtils.isEmpty(this.f79138c)) {
                this.f79138c = Build.HARDWARE;
            }
        }

        private String b(String str) {
            Matcher matcher = Pattern.compile(":\\s*(.*)").matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return null;
        }

        private void e() throws Throwable {
            RandomAccessFile randomAccessFile;
            Throwable th2;
            RandomAccessFile randomAccessFile2 = null;
            try {
                randomAccessFile = new RandomAccessFile("/proc/cpuinfo", "r");
                while (true) {
                    try {
                        String line = randomAccessFile.readLine();
                        if (line != null) {
                            if (line.startsWith("model name:") || line.startsWith("Hardware:")) {
                                this.f79137b = b(line);
                            } else if (line.startsWith("vendor_id:")) {
                                this.f79138c = b(line);
                            }
                            if (this.f79137b != null && this.f79138c != null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Exception unused) {
                        randomAccessFile2 = randomAccessFile;
                        io.bidmachine.core.h.i(randomAccessFile2);
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        io.bidmachine.core.h.i(randomAccessFile);
                        throw th2;
                    }
                }
                io.bidmachine.core.h.i(randomAccessFile);
            } catch (Exception unused2) {
            } catch (Throwable th4) {
                randomAccessFile = null;
                th2 = th4;
            }
        }

        String c() {
            return this.f79137b;
        }

        String d() {
            return this.f79138c;
        }

        void f(Context context) throws Throwable {
            if (TextUtils.isEmpty(this.f79137b)) {
                this.f79137b = this.f79136a.a(context, "cpu_name");
            }
            if (TextUtils.isEmpty(this.f79138c)) {
                this.f79138c = this.f79136a.a(context, "cpu_vendor");
            }
            if (TextUtils.isEmpty(this.f79137b) || TextUtils.isEmpty(this.f79138c)) {
                a();
                this.f79136a.b(context, "cpu_name", this.f79137b);
                this.f79136a.b(context, "cpu_vendor", this.f79138c);
            }
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y3 f79139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f79140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f79141c;

        c(y3 y3Var) {
            this.f79139a = y3Var;
        }

        private EGLConfig a(EGLDisplay eGLDisplay) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr = new int[1];
            EGL14.eglChooseConfig(eGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr, 0);
            if (iArr[0] == 0) {
                return null;
            }
            return eGLConfigArr[0];
        }

        private void b(EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext) {
            if (eGLDisplay != null) {
                i(eGLDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                if (eGLSurface != null) {
                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                }
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                }
                EGL14.eglTerminate(eGLDisplay);
            }
        }

        private EGLContext c(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            return EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        }

        private EGLSurface d(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            return EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
        }

        private void e() throws Throwable {
            EGLContext eGLContext;
            EGLSurface eGLSurfaceD;
            EGLContext eGLContext2;
            EGLContext eGLContext3;
            EGLDisplay eGLDisplay = null;
            eGLContextC = null;
            EGLContext eGLContextC = null;
            EGLSurface eGLSurface = null;
            EGLDisplay eGLDisplay2 = null;
            try {
                EGLDisplay eGLDisplayH = h();
                try {
                    EGLConfig eGLConfigA = a(eGLDisplayH);
                    if (eGLConfigA != null) {
                        eGLSurfaceD = d(eGLDisplayH, eGLConfigA);
                        try {
                            eGLContextC = c(eGLDisplayH, eGLConfigA);
                            i(eGLDisplayH, eGLSurfaceD, eGLContextC);
                            this.f79140b = GLES20.glGetString(7937);
                            this.f79141c = GLES20.glGetString(7936);
                            eGLContext3 = eGLContextC;
                            eGLSurface = eGLSurfaceD;
                        } catch (Exception unused) {
                            eGLContext2 = eGLContextC;
                            eGLDisplay2 = eGLDisplayH;
                            b(eGLDisplay2, eGLSurfaceD, eGLContext2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            eGLContext = eGLContextC;
                            eGLDisplay = eGLDisplayH;
                            b(eGLDisplay, eGLSurfaceD, eGLContext);
                            throw th;
                        }
                    } else {
                        eGLContext3 = null;
                    }
                    b(eGLDisplayH, eGLSurface, eGLContext3);
                } catch (Exception unused2) {
                    eGLSurfaceD = null;
                    eGLDisplay2 = eGLDisplayH;
                    eGLContext2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    eGLSurfaceD = null;
                    eGLDisplay = eGLDisplayH;
                    eGLContext = null;
                }
            } catch (Exception unused3) {
                eGLContext2 = null;
                eGLSurfaceD = null;
            } catch (Throwable th4) {
                th = th4;
                eGLContext = null;
                eGLSurfaceD = null;
            }
        }

        private EGLDisplay h() {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            int[] iArr = new int[2];
            EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
            return eGLDisplayEglGetDisplay;
        }

        private void i(EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }

        String f() {
            return this.f79140b;
        }

        String g() {
            return this.f79141c;
        }

        void j(Context context) throws Throwable {
            if (TextUtils.isEmpty(this.f79140b)) {
                this.f79140b = this.f79139a.a(context, "gpu_name");
            }
            if (TextUtils.isEmpty(this.f79141c)) {
                this.f79141c = this.f79139a.a(context, "gpu_vendor");
            }
            if (TextUtils.isEmpty(this.f79140b) || TextUtils.isEmpty(this.f79141c)) {
                e();
                this.f79139a.b(context, "gpu_name", this.f79140b);
                this.f79139a.b(context, "gpu_vendor", this.f79141c);
            }
        }
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f79142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f79143b;

        d() {
        }

        private String a(String str) {
            Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return null;
        }

        private Long d(String str) {
            if (str == null) {
                return null;
            }
            try {
                return Long.valueOf(Long.parseLong(str) * 1024);
            } catch (NumberFormatException unused) {
                return null;
            }
        }

        Long b() {
            return this.f79143b;
        }

        Long c() {
            return this.f79142a;
        }

        void e() throws Throwable {
            RandomAccessFile randomAccessFile;
            Throwable th2;
            RandomAccessFile randomAccessFile2 = null;
            try {
                randomAccessFile = new RandomAccessFile(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, "r");
                while (true) {
                    try {
                        String line = randomAccessFile.readLine();
                        if (line != null) {
                            if (line.startsWith("MemTotal:")) {
                                this.f79142a = d(a(line));
                            } else if (line.startsWith("MemAvailable:")) {
                                this.f79143b = d(a(line));
                            }
                            if (this.f79142a != null && this.f79143b != null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Exception unused) {
                        randomAccessFile2 = randomAccessFile;
                        io.bidmachine.core.h.i(randomAccessFile2);
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        io.bidmachine.core.h.i(randomAccessFile);
                        throw th2;
                    }
                }
                io.bidmachine.core.h.i(randomAccessFile);
            } catch (Exception unused2) {
            } catch (Throwable th4) {
                randomAccessFile = null;
                th2 = th4;
            }
        }
    }

    private DeviceInfo(@NonNull Context context) {
        y3 y3Var = new y3();
        this.cache = y3Var;
        this.cpu = new b(y3Var);
        this.gpu = new c(y3Var);
        this.osName = "android";
        this.osVersion = String.valueOf(Build.VERSION.SDK_INT);
        this.manufacturer = pd.f.b();
        this.model = pd.f.c();
        this.screenDpi = ae.c.l(context);
        this.screenDensity = pd.f.g(context);
        this.isTablet = pd.f.h(context);
        this.phoneMCCMNC = pd.f.e(context);
        this.phoneCarrier = pd.f.f(context);
    }

    @Nullable
    private String getKernelVersionThroughProcVersion() throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th2;
        try {
            randomAccessFile = new RandomAccessFile("/proc/version", "r");
        } catch (Exception unused) {
            randomAccessFile = null;
        } catch (Throwable th3) {
            randomAccessFile = null;
            th2 = th3;
        }
        try {
            String line = randomAccessFile.readLine();
            io.bidmachine.core.h.i(randomAccessFile);
            return line;
        } catch (Exception unused2) {
            io.bidmachine.core.h.i(randomAccessFile);
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            io.bidmachine.core.h.i(randomAccessFile);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.BufferedReader, java.io.Closeable] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getKernelVersionThroughUName() throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3e
            java.lang.String r2 = "uname -a"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3e
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.io.InputStream r3 = r1.getInputStream()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L4d
            io.bidmachine.core.h.i(r3)
            io.bidmachine.core.h.i(r2)
            r1.destroy()
            return r0
        L27:
            r0 = move-exception
            goto L41
        L29:
            r3 = move-exception
            r4 = r3
            r3 = r0
            r0 = r4
            goto L41
        L2e:
            r3 = r0
            goto L4d
        L30:
            r2 = move-exception
            r3 = r0
            r0 = r2
            r2 = r3
            goto L41
        L35:
            r2 = r0
        L36:
            r3 = r2
            goto L4d
        L38:
            r1 = move-exception
            r2 = r0
            r3 = r2
            r0 = r1
            r1 = r3
            goto L41
        L3e:
            r1 = r0
            r2 = r1
            goto L36
        L41:
            io.bidmachine.core.h.i(r3)
            io.bidmachine.core.h.i(r2)
            if (r1 == 0) goto L4c
            r1.destroy()
        L4c:
            throw r0
        L4d:
            io.bidmachine.core.h.i(r3)
            io.bidmachine.core.h.i(r2)
            if (r1 == 0) goto L58
            r1.destroy()
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.DeviceInfo.getKernelVersionThroughUName():java.lang.String");
    }

    @NonNull
    public static DeviceInfo obtain(@NonNull Context context) {
        DeviceInfo deviceInfo;
        DeviceInfo deviceInfo2 = instance;
        if (deviceInfo2 != null) {
            return deviceInfo2;
        }
        synchronized (DeviceInfo.class) {
            try {
                deviceInfo = instance;
                if (deviceInfo == null) {
                    deviceInfo = new DeviceInfo(context);
                    instance = deviceInfo;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return deviceInfo;
    }

    @NonNull
    a getAudio() {
        return this.audio;
    }

    @Nullable
    Long getAvailableDiskSpaceInMB() {
        try {
            if (!io.bidmachine.core.h.H()) {
                return null;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return Long.valueOf((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } catch (Exception unused) {
            return null;
        }
    }

    @NonNull
    b getCpu() {
        return this.cpu;
    }

    @NonNull
    c getGpu() {
        return this.gpu;
    }

    @Nullable
    String getHWV() throws Throwable {
        String str = this.hwv;
        if (str != null) {
            return str;
        }
        String kernelVersionThroughProcVersion = getKernelVersionThroughProcVersion();
        if (!TextUtils.isEmpty(kernelVersionThroughProcVersion)) {
            this.hwv = kernelVersionThroughProcVersion;
            return kernelVersionThroughProcVersion;
        }
        String kernelVersionThroughUName = getKernelVersionThroughUName();
        this.hwv = kernelVersionThroughUName;
        return kernelVersionThroughUName;
    }

    @NonNull
    d getRam() {
        return this.ram;
    }

    @Nullable
    Long getTotalDiskSpaceInMB() {
        Long l10 = this.totalDiskSpaceInMB;
        if (l10 != null) {
            return l10;
        }
        try {
            if (!io.bidmachine.core.h.H()) {
                return null;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            Long lValueOf = Long.valueOf((statFs.getBlockSizeLong() * statFs.getBlockCountLong()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            this.totalDiskSpaceInMB = lValueOf;
            return lValueOf;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean isDeviceRooted() {
        /*
            r10 = this;
            java.lang.Boolean r0 = r10.isRooted
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            return r0
        L9:
            r0 = 1
            r1 = 0
            java.lang.String r2 = "/sbin/su"
            java.lang.String r3 = "/system/bin/su"
            java.lang.String r4 = "/system/xbin/su"
            java.lang.String r5 = "/data/local/xbin/su"
            java.lang.String r6 = "/data/local/bin/su"
            java.lang.String r7 = "/system/sd/xbin/su"
            java.lang.String r8 = "/system/bin/failsafe/su"
            java.lang.String r9 = "/data/local/su"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9}     // Catch: java.lang.Exception -> L39
            r3 = r1
        L20:
            r4 = 8
            if (r3 >= r4) goto L39
            r4 = r2[r3]     // Catch: java.lang.Exception -> L39
            java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> L39
            r5.<init>(r4)     // Catch: java.lang.Exception -> L39
            boolean r4 = r5.exists()     // Catch: java.lang.Exception -> L39
            if (r4 == 0) goto L36
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L39
            r10.isRooted = r2     // Catch: java.lang.Exception -> L39
            return r0
        L36:
            int r3 = r3 + 1
            goto L20
        L39:
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            java.lang.String r4 = "/system/xbin/which"
            java.lang.String r5 = "su"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            java.lang.Process r2 = r3.exec(r4)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            java.io.InputStream r5 = r2.getInputStream()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            java.lang.String r3 = r3.readLine()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            if (r3 == 0) goto L5f
            goto L60
        L5f:
            r0 = r1
        L60:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            r10.isRooted = r3     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            r2.destroy()
            return r0
        L6a:
            r0 = move-exception
            if (r2 == 0) goto L70
            r2.destroy()
        L70:
            throw r0
        L71:
            if (r2 == 0) goto L76
            r2.destroy()
        L76:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.isRooted = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.DeviceInfo.isDeviceRooted():boolean");
    }

    void updateHwInfo(@NonNull Context context) throws Throwable {
        this.cpu.f(context);
        this.gpu.j(context);
        this.ram.e();
    }
}
