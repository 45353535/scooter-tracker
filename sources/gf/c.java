package gf;

import java.nio.charset.MalformedInputException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends MalformedInputException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f72764b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String message) {
        super(0);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f72764b = message;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public String getMessage() {
        return this.f72764b;
    }
}
