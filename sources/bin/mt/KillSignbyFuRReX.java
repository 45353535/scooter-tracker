package bin.mt;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandleInfo;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes13.dex */
public class KillSignbyFuRReX extends Application {

    public class a {
        private boolean override;
    }

    public final class b {
        private transient int accessFlags;
        private transient int classFlags;
        private transient ClassLoader classLoader;
        private transient int classSize;
        private transient int clinitThreadId;
        private transient Class componentType;
        private transient short copiedMethodsOffset;
        private transient Object dexCache;
        private transient int dexClassDefIndex;
        private volatile transient int dexTypeIndex;
        private transient Object extData;
        private transient long iFields;
        private transient Object[] ifTable;
        private transient long methods;
        private transient String name;
        private transient int numReferenceInstanceFields;
        private transient int numReferenceStaticFields;
        private transient int objectSize;
        private transient int objectSizeAllocFastPath;
        private transient int primitiveType;
        private transient int referenceInstanceOffsets;
        private transient long sFields;
        private transient int status;
        private transient Class superClass;
        private transient short virtualMethodsOffset;
        private transient Object vtable;
    }

    public final class c extends a {
        private int accessFlags;
        private long artMethod;
        private b declaringClass;
        private b declaringClassOfOverriddenMethod;
        private Object[] parameters;
    }

    public final class d {
        private final Member member = null;
        private final f handle = null;
    }

    public final class e {
        private e(Object... objArr) {
            throw new IllegalStateException("Failed to new a instance");
        }

        private static Object invoke(Object... objArr) {
            throw new IllegalStateException("Failed to invoke the method");
        }
    }

    public class f {
        private f cachedSpreadInvoker;
        private MethodType nominalType;
        private final MethodType type = null;
        protected final int handleKind = 0;
        protected final long artFieldOrMethod = 0;
    }

    public final class g extends f {
        private final MethodHandleInfo info = null;
    }

    public final class h {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static int f6421s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static int f6422t;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f6423i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f6424j;

        private static void a() {
        }

        private static void b() {
        }
    }

    public final /* synthetic */ class i {
    }

    public final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unsafe f6425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f6426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f6427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f6428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f6429e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final HashSet f6430f = new HashSet();

        static {
            try {
                Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", null).invoke(null, null);
                f6425a = unsafe;
                f6426b = unsafe.objectFieldOffset(c.class.getDeclaredField("artMethod"));
                unsafe.objectFieldOffset(c.class.getDeclaredField("declaringClass"));
                long jObjectFieldOffset = unsafe.objectFieldOffset(f.class.getDeclaredField("artFieldOrMethod"));
                unsafe.objectFieldOffset(g.class.getDeclaredField("info"));
                long jObjectFieldOffset2 = unsafe.objectFieldOffset(b.class.getDeclaredField(POBCoreNativeConstants.NATIVE_METHODS));
                f6427c = jObjectFieldOffset2;
                long jObjectFieldOffset3 = unsafe.objectFieldOffset(b.class.getDeclaredField("iFields"));
                unsafe.objectFieldOffset(b.class.getDeclaredField("sFields"));
                unsafe.objectFieldOffset(d.class.getDeclaredField("member"));
                Method declaredMethod = h.class.getDeclaredMethod("a", null);
                Method declaredMethod2 = h.class.getDeclaredMethod("b", null);
                declaredMethod.setAccessible(true);
                declaredMethod2.setAccessible(true);
                MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
                MethodHandle methodHandleUnreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
                long j10 = unsafe.getLong(methodHandleUnreflect, jObjectFieldOffset);
                long j11 = unsafe.getLong(methodHandleUnreflect2, jObjectFieldOffset);
                long j12 = unsafe.getLong(h.class, jObjectFieldOffset2);
                long j13 = j11 - j10;
                f6428d = j13;
                f6429e = (j10 - j12) - j13;
                Field declaredField = h.class.getDeclaredField(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT);
                Field declaredField2 = h.class.getDeclaredField("j");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
                MethodHandle methodHandleUnreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
                unsafe.getLong(methodHandleUnreflectGetter, jObjectFieldOffset);
                unsafe.getLong(methodHandleUnreflectGetter2, jObjectFieldOffset);
                unsafe.getLong(h.class, jObjectFieldOffset3);
            } catch (ReflectiveOperationException e10) {
                Log.e("HiddenApiBypass", "Initialize error", e10);
                throw new ExceptionInInitializerError(e10);
            }
        }

        public static Object a(Class cls, Object obj, String str, Object... objArr) throws NoSuchMethodException {
            int i10;
            if (obj != null && !cls.isInstance(obj)) {
                throw new IllegalArgumentException("this object is not an instance of the given class");
            }
            Method declaredMethod = e.class.getDeclaredMethod("invoke", Object[].class);
            declaredMethod.setAccessible(true);
            Unsafe unsafe = f6425a;
            long j10 = unsafe.getLong(cls, f6427c);
            if (j10 == 0) {
                throw new NoSuchMethodException("Cannot find matching method");
            }
            int i11 = unsafe.getInt(j10);
            for (int i12 = 0; i12 < i11; i12++) {
                f6425a.putLong(declaredMethod, f6426b, (((long) i12) * f6428d) + j10 + f6429e);
                if (str.equals(declaredMethod.getName())) {
                    Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
                    if (parameterTypes.length == objArr.length) {
                        while (i10 < parameterTypes.length) {
                            if (parameterTypes[i10].isPrimitive()) {
                                Class<?> cls2 = parameterTypes[i10];
                                i10 = ((cls2 != Integer.TYPE || (objArr[i10] instanceof Integer)) && (cls2 != Byte.TYPE || (objArr[i10] instanceof Byte)) && ((cls2 != Character.TYPE || (objArr[i10] instanceof Character)) && ((cls2 != Boolean.TYPE || (objArr[i10] instanceof Boolean)) && ((cls2 != Double.TYPE || (objArr[i10] instanceof Double)) && ((cls2 != Float.TYPE || (objArr[i10] instanceof Float)) && ((cls2 != Long.TYPE || (objArr[i10] instanceof Long)) && (cls2 != Short.TYPE || (objArr[i10] instanceof Short)))))))) ? i10 + 1 : 0;
                            } else {
                                Object obj2 = objArr[i10];
                                if (obj2 == null || parameterTypes[i10].isInstance(obj2)) {
                                }
                            }
                        }
                        return declaredMethod.invoke(obj, objArr);
                    }
                    continue;
                }
            }
            throw new NoSuchMethodException("Cannot find matching method");
        }

        public static boolean b(String... strArr) {
            try {
                a(VMRuntime.class, a(VMRuntime.class, null, "getRuntime", new Object[0]), "setHiddenApiExemptions", strArr);
                return true;
            } catch (Throwable th2) {
                Log.w("HiddenApiBypass", "setHiddenApiExemptions", th2);
                return false;
            }
        }
    }

    public final /* synthetic */ class k {
    }

    public final class l implements Parcelable.Creator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Parcelable.Creator f6431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f6432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Signature f6433c;

        public l(Parcelable.Creator creator, String str, Signature signature) {
            this.f6431a = creator;
            this.f6432b = str;
            this.f6433c = signature;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Signature[] apkContentsSigners;
            PackageInfo packageInfo = (PackageInfo) this.f6431a.createFromParcel(parcel);
            if (packageInfo.packageName.equals(this.f6432b)) {
                Signature[] signatureArr = packageInfo.signatures;
                Signature signature = this.f6433c;
                if (signatureArr != null && signatureArr.length > 0) {
                    signatureArr[0] = signature;
                }
                if (Build.VERSION.SDK_INT >= 28 && packageInfo.signingInfo != null && (apkContentsSigners = packageInfo.signingInfo.getApkContentsSigners()) != null && apkContentsSigners.length > 0) {
                    apkContentsSigners[0] = signature;
                }
            }
            return packageInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i10) {
            return (PackageInfo[]) this.f6431a.newArray(i10);
        }
    }

    static {
        killPM("com.ktwapps.speedometer", "MIICwzCCAaugAwIBAgIELVDWZzANBgkqhkiG9w0BAQsFADASMRAwDgYDVQQLEwdLdHdhcHBzMB4XDTE5MDEwMzEwNDcyNFoXDTQzMTIyODEwNDcyNFowEjEQMA4GA1UECxMHS3R3YXBwczCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAJoQpNKZnQfCPd/ECYXhLFLpwOiBBJqyEZnkK08qLdNkiBGC7ZBcFG44TKGpM4qnYNGJpJy0q1Rcgwfzs64RmPrV7BVf2eOwwOudsyPRPm0AwE47+4F1PII00lbOg0q5QK7IlWzwHYjpjTfrS42etTFFRX7jYcNGL5IbuNx4hs82PxjBM6XnRZ4yFBbmgrH1vYETx7w903Cub9pOAeh0ZN/XNJdrcndKgmsU8XDdBPismMzIhEJMeBdSstmH4a+7IEMVGeMN0wGNJq8KWq3DSEPdio5XuKPRz0Er87MS1iGZ2Uh/O6QAicSFZSgn37ctmZeAI8xIazzXKueBTL/Ks+ECAwEAAaMhMB8wHQYDVR0OBBYEFKQySgub+O3LHazqDNe1gM/XWdPTMA0GCSqGSIb3DQEBCwUAA4IBAQCICbI6umrP0dwH5pDyLCBWEzZuRY/mQJUoufp6twxaMS+9cW06U+ZHIe5mgvZePeKrpEQyRPi7EPXaB9jdTIh4+boCTC5qKJgDuhFLyBVz+19nl41BMLaYFTQmhiKshVFfyiadszbUfZMLA7vLsgSlsnWFjzAiLpAxjK9CiCOxr4i22J4o3RZEz8Ma0S7U7eP0CSjGgBX5FGYdunVMZ67nxUSbynuRxc3KPEzVZAxNIrD3h6xBOQQ5dgdD/SpoL9QODc+mMsvIEFXAg9K8tg9Xl56mkKHvRfpYpS5QxFX8CVo2ce1500uf3Yr6ivwG6J8RI7SDHNGLaILfBFApY5mJ");
        killOpen("com.ktwapps.speedometer", "", "", "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Field a(java.lang.Class r3, java.lang.String r4) throws java.lang.NoSuchFieldException {
        /*
            r0 = 1
            java.lang.reflect.Field r1 = r3.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L9
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L9
            return r1
        L9:
            r1 = move-exception
        La:
            java.lang.Class r3 = r3.getSuperclass()
            if (r3 == 0) goto L22
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L22
            java.lang.reflect.Field r2 = r3.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L20
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L20
            return r2
        L20:
            goto La
        L22:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bin.mt.KillSignbyFuRReX.a(java.lang.Class, java.lang.String):java.lang.reflect.Field");
    }

    public static boolean b(String str, String str2) {
        if (str2.startsWith("/") && str2.endsWith(".apk")) {
            String[] strArrSplit = str2.substring(1).split("/", 6);
            int length = strArrSplit.length;
            if (length == 4 || length == 5) {
                if (strArrSplit[0].equals("data") && strArrSplit[1].equals("app") && strArrSplit[length - 1].equals("base.apk")) {
                    return strArrSplit[length - 2].startsWith(str);
                }
                if (strArrSplit[0].equals("mnt") && strArrSplit[1].equals("asec") && strArrSplit[length - 1].equals("pkg.apk")) {
                    return strArrSplit[length - 2].startsWith(str);
                }
            } else if (length == 3) {
                if (strArrSplit[0].equals("data") && strArrSplit[1].equals("app")) {
                    return strArrSplit[2].startsWith(str);
                }
            } else if (length == 6 && strArrSplit[0].equals("mnt") && strArrSplit[1].equals("expand") && strArrSplit[3].equals("app") && strArrSplit[5].equals("base.apk")) {
                return strArrSplit[4].endsWith(str);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void killOpen(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bin.mt.KillSignbyFuRReX.killOpen(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private static void killPM(String str, String str2) {
        try {
            a(PackageInfo.class, "CREATOR").set(null, new l(PackageInfo.CREATOR, str, new Signature(Base64.decode(str2, 2))));
            if (Build.VERSION.SDK_INT >= 28) {
                HashSet hashSet = j.f6430f;
                hashSet.addAll(Arrays.asList("Landroid/os/Parcel;", "Landroid/content/pm", "Landroid/app"));
                String[] strArr = new String[hashSet.size()];
                hashSet.toArray(strArr);
                j.b(strArr);
            }
            try {
                Object obj = a(PackageManager.class, "sPackageInfoCache").get(null);
                obj.getClass().getMethod("clear", null).invoke(obj, null);
            } catch (Throwable unused) {
            }
            try {
                ((Map) a(Parcel.class, "mCreators").get(null)).clear();
            } catch (Throwable unused2) {
            }
            try {
                ((Map) a(Parcel.class, "sPairedCreators").get(null)).clear();
            } catch (Throwable unused3) {
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
