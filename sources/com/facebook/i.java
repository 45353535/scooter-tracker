package com.facebook;

import com.facebook.internal.e;
import java.util.Random;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
public class i extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f19834b = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(final String str) {
        super(str);
        Random random = new Random();
        if (str == null || !s.D() || random.nextInt(100) <= 50) {
            return;
        }
        com.facebook.internal.e.a(e.b.ErrorReport, new e.a() { // from class: com.facebook.h
            @Override // com.facebook.internal.e.a
            public final void a(boolean z10) {
                i.b(str, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, boolean z10) {
        if (z10) {
            try {
                f3.e.g(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public i(String str, Throwable th2) {
        super(str, th2);
    }

    public i(Throwable th2) {
        super(th2);
    }
}
