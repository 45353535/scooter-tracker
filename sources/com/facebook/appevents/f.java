package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.appevents.a;
import com.facebook.appevents.d;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f19655a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f19656b = f.class.getName();

    private static final class a extends ObjectInputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0329a f19657b = new C0329a(null);

        /* JADX INFO: renamed from: com.facebook.appevents.f$a$a, reason: collision with other inner class name */
        public static final class C0329a {
            public /* synthetic */ C0329a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0329a() {
            }
        }

        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            if (Intrinsics.areEqual(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                resultClassDescriptor = ObjectStreamClass.lookup(a.b.class);
            } else if (Intrinsics.areEqual(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                resultClassDescriptor = ObjectStreamClass.lookup(d.b.class);
            }
            Intrinsics.checkNotNullExpressionValue(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }

    private f() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0003, B:8:0x002b, B:9:0x002e, B:44:0x009a, B:14:0x003c, B:32:0x006f, B:33:0x0072, B:37:0x0084, B:36:0x007d, B:26:0x0059, B:27:0x005c, B:30:0x0067, B:31:0x006b, B:38:0x0085, B:39:0x0088, B:42:0x0093), top: B:57:0x0003, inners: #2, #3, #9, #10 }] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized com.facebook.appevents.q0 a() {
        /*
            java.lang.Class<com.facebook.appevents.f> r0 = com.facebook.appevents.f.class
            monitor-enter(r0)
            v2.h.b()     // Catch: java.lang.Throwable -> L38
            android.content.Context r1 = com.facebook.s.m()     // Catch: java.lang.Throwable -> L38
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d java.io.FileNotFoundException -> L50
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d java.io.FileNotFoundException -> L50
            com.facebook.appevents.f$a r4 = new com.facebook.appevents.f$a     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d java.io.FileNotFoundException -> L50
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d java.io.FileNotFoundException -> L50
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d java.io.FileNotFoundException -> L50
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d java.io.FileNotFoundException -> L50
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47 java.io.FileNotFoundException -> L85
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r5)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47 java.io.FileNotFoundException -> L85
            com.facebook.appevents.q0 r3 = (com.facebook.appevents.q0) r3     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47 java.io.FileNotFoundException -> L85
            com.facebook.internal.z.i(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            r1.delete()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            goto L43
        L38:
            r1 = move-exception
            goto La1
        L3b:
            r1 = move-exception
            java.lang.String r2 = com.facebook.appevents.f.f19656b     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch: java.lang.Throwable -> L38
        L43:
            r2 = r3
            goto L98
        L45:
            r2 = move-exception
            goto L6f
        L47:
            r3 = move-exception
            goto L52
        L49:
            r3 = move-exception
            r4 = r2
            r2 = r3
            goto L6f
        L4d:
            r3 = move-exception
            r4 = r2
            goto L52
        L50:
            r4 = r2
            goto L85
        L52:
            java.lang.String r5 = com.facebook.appevents.f.f19656b     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L45
            com.facebook.internal.z.i(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L66
            r1.delete()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L66
            goto L98
        L66:
            r1 = move-exception
            java.lang.String r3 = com.facebook.appevents.f.f19656b     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L6b:
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L38
            goto L98
        L6f:
            com.facebook.internal.z.i(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L7c
            r1.delete()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L7c
            goto L84
        L7c:
            r1 = move-exception
            java.lang.String r3 = com.facebook.appevents.f.f19656b     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L38
        L84:
            throw r2     // Catch: java.lang.Throwable -> L38
        L85:
            com.facebook.internal.z.i(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L92
            r1.delete()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L92
            goto L98
        L92:
            r1 = move-exception
            java.lang.String r3 = com.facebook.appevents.f.f19656b     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L6b
        L98:
            if (r2 != 0) goto L9f
            com.facebook.appevents.q0 r2 = new com.facebook.appevents.q0     // Catch: java.lang.Throwable -> L38
            r2.<init>()     // Catch: java.lang.Throwable -> L38
        L9f:
            monitor-exit(r0)
            return r2
        La1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.f.a():com.facebook.appevents.q0");
    }

    public static final void b(q0 q0Var) {
        Context contextM = com.facebook.s.m();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(contextM.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(q0Var);
                com.facebook.internal.z.i(objectOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w(f19656b, "Got unexpected exception while persisting events: ", th);
                    try {
                        contextM.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                } finally {
                    com.facebook.internal.z.i(objectOutputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
