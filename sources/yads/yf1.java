package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class yf1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yf1 f118170b = new yf1();

    public yf1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return String.valueOf(System.currentTimeMillis());
    }
}
