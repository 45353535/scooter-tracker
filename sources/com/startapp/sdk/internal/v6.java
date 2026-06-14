package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class v6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f65373c = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f65374d = {"goldfish"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f65375e = {"/dev/socket/qemud", "/dev/qemu_pipe"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f65376f = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f65377g = {"fstab.andy", "ueventd.andy.rc"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f65378h = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final se[] f65379i = {new se("init.svc.qemud", null), new se("init.svc.qemu-props", null), new se("qemu.hw.mainkeys", null), new se("qemu.sf.fake_camera", null), new se("qemu.sf.lcd_density", null), new se("ro.bootloader", "unknown"), new se("ro.bootmode", "unknown"), new se("ro.hardware", "goldfish"), new se("ro.kernel.android.qemud", null), new se("ro.kernel.qemu.gles", null), new se("ro.kernel.qemu", "1"), new se("ro.product.device", "generic"), new se("ro.product.model", "sdk"), new se("ro.product.name", "sdk"), new se("ro.serialno", null), new se("ro.build.description", "72656C656173652D6B657973"), new se("ro.build.fingerprint", "3A757365722F72656C656173652D6B657973"), new se("net.eth0.dns1", null), new se("rild.libpath", "2F73797374656D2F6C69622F6C69627265666572656E63652D72696C2E736F"), new se("ro.radio.use-ppp", null), new se("gsm.version.baseband", null), new se("ro.build.tags", "72656C656173652D6B65"), new se("ro.build.display.id", "746573742D"), new se("init.svc.console", null)};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static v6 f65380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Boolean f65381k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f65383b;

    public v6(Context context) {
        ArrayList arrayList = new ArrayList();
        this.f65383b = arrayList;
        this.f65382a = context;
        arrayList.add("com.google.android.launcher.layouts.genymotion");
        arrayList.add("com.bluestacks");
        arrayList.add("com.bignox.app");
        arrayList.add("com.vphone.launcher");
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.v6.a(android.content.Context):boolean");
    }

    public final boolean a(String[] strArr, String str) {
        File file;
        for (String str2 : strArr) {
            if (this.f65382a.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && str2.contains("/") && str.equals("Nox")) {
                file = new File(Environment.getExternalStorageDirectory() + str2);
            } else {
                file = new File(str2);
            }
            if (file.exists()) {
                return true;
            }
        }
        return false;
    }
}
