package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;
import com.inmobi.media.AbstractC4170y2;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.inmobi.media.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4170y2 extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f39973a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4170y2(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39973a = lf.i.a(new Function0() { // from class: w3.fd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC4170y2.a(this.f107056b);
            }
        });
    }

    public static final Ua a(AbstractC4170y2 abstractC4170y2) {
        return abstractC4170y2.d();
    }

    public abstract Ua d();

    @NotNull
    public final Ua getLandingPageHandler() {
        return (Ua) this.f39973a.getValue();
    }
}
