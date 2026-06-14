package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
public final class jf extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final jf f112331b = new jf();

    public jf() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Regex("at\\s+([^\\(]+)\\(([^:]+):(\\d+)\\)");
    }
}
