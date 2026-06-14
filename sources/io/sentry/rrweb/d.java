package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import io.sentry.util.w;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends io.sentry.rrweb.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f84111d;

    public static final class a {
        public boolean a(d dVar, String str, m3 m3Var, ILogger iLogger) {
            if (!str.equals("source")) {
                return false;
            }
            dVar.f84111d = (b) w.c((b) m3Var.B(iLogger, new b.a()), "");
            return true;
        }
    }

    public enum b implements d2 {
        Mutation,
        MouseMove,
        MouseInteraction,
        Scroll,
        ViewportResize,
        Input,
        TouchMove,
        MediaInteraction,
        StyleSheetRule,
        CanvasMutation,
        Font,
        Log,
        Drag,
        StyleDeclaration,
        Selection,
        AdoptedStyleSheet,
        CustomElement;

        public static final class a implements t1 {
            @Override // io.sentry.t1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(m3 m3Var, ILogger iLogger) {
                return b.values()[m3Var.nextInt()];
            }
        }

        @Override // io.sentry.d2
        public void serialize(@NotNull n3 n3Var, @NotNull ILogger iLogger) throws IOException {
            n3Var.b(ordinal());
        }
    }

    public static final class c {
        public void a(d dVar, n3 n3Var, ILogger iLogger) {
            n3Var.e("source").j(iLogger, dVar.f84111d);
        }
    }

    public d(b bVar) {
        super(io.sentry.rrweb.c.IncrementalSnapshot);
        this.f84111d = bVar;
    }
}
