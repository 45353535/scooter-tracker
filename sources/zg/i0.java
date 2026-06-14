package zg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 {
    public static final e0 a(Number value, String key, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return e(-1, l(value, key, output));
    }

    public static final g0 b(Number value, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        return new g0("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) j(output, 0, 1, null)));
    }

    public static final g0 c(Number value, String key, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return new g0(l(value, key, output));
    }

    public static final g0 d(SerialDescriptor keyDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        return new g0("Value of type '" + keyDescriptor.h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final e0 e(int i10, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i10 >= 0) {
            message = "Unexpected JSON token at offset " + i10 + ": " + message;
        }
        return new e0(message);
    }

    public static final e0 f(int i10, String message, CharSequence input) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        return e(i10, message + "\nJSON input: " + ((Object) i(input, i10)));
    }

    public static final Void g(a aVar, String entity) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(entity, "entity");
        aVar.y("Trailing comma before the end of JSON " + entity, aVar.f119378a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw new lf.g();
    }

    public static /* synthetic */ Void h(a aVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "object";
        }
        return g(aVar, str);
    }

    public static final CharSequence i(CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i10 != -1) {
                int i11 = i10 - 30;
                int i12 = i10 + 30;
                return (i11 <= 0 ? "" : ".....") + charSequence.subSequence(kotlin.ranges.g.e(i11, 0), kotlin.ranges.g.j(i12, charSequence.length())).toString() + (i12 >= charSequence.length() ? "" : ".....");
            }
            int length = charSequence.length() - 60;
            if (length > 0) {
                return "....." + charSequence.subSequence(length, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static /* synthetic */ CharSequence j(CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        return i(charSequence, i10);
    }

    public static final Void k(a aVar, Number result) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        a.z(aVar, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new lf.g();
    }

    private static final String l(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) j(str2, 0, 1, null));
    }
}
