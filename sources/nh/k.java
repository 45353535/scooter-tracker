package nh;

import hh.y;
import java.net.ProtocolException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f96172d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f96173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96175c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(String statusLine) throws ProtocolException {
            y yVar;
            int i10;
            String strSubstring;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            if (StringsKt.a0(statusLine, "HTTP/1.", false, 2, null)) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    yVar = y.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    yVar = y.HTTP_1_1;
                }
            } else {
                if (!StringsKt.a0(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                yVar = y.HTTP_1_0;
                i10 = 4;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                String strSubstring2 = statusLine.substring(i10, i11);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i12 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i11) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i11) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    strSubstring = statusLine.substring(i10 + 4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new k(yVar, i12, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }

        private a() {
        }
    }

    public k(y protocol, int i10, String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f96173a = protocol;
        this.f96174b = i10;
        this.f96175c = message;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f96173a == y.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f96174b);
        sb2.append(' ');
        sb2.append(this.f96175c);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
