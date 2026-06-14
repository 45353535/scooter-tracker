package ug;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f105655b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List missingFields, String str, Throwable th2) {
        super(str, th2);
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        this.f105655b = missingFields;
    }

    public final List d() {
        return this.f105655b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(List missingFields, String serialName) {
        String str;
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        if (missingFields.size() == 1) {
            str = "Field '" + ((String) missingFields.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(missingFields, str, null);
    }
}
