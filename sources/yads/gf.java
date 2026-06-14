package yads;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class gf extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final gf f111172b = new gf();

    public gf() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    }
}
