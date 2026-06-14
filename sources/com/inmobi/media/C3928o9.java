package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Lazy;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.o9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3928o9 {
    public static void a() {
        Context context;
        try {
            Iterator it = AbstractC3978q9.f39363a.iterator();
            while (it.hasNext()) {
                Jb jb2 = (Jb) ((WeakReference) it.next()).get();
                if (jb2 != null && (context = (Context) jb2.f37128f.get()) != null) {
                    CoroutineScope coroutineScope = Sb.f37702a;
                    Rb.a(new Ib(jb2, context, null));
                }
            }
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
    }
}
