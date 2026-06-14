package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.Serializable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LOWER_UNDERSCORE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class CaseFormat {
    public static final CaseFormat LOWER_CAMEL;
    public static final CaseFormat LOWER_UNDERSCORE;
    public static final CaseFormat UPPER_CAMEL;
    public static final CaseFormat UPPER_UNDERSCORE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharMatcher f28816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28817c;
    public static final CaseFormat LOWER_HYPHEN = new CaseFormat("LOWER_HYPHEN", 0, CharMatcher.is('-'), TokenBuilder.TOKEN_DELIMITER) { // from class: com.google.common.base.CaseFormat.1
        @Override // com.google.common.base.CaseFormat
        String h(CaseFormat caseFormat, String str) {
            return caseFormat == CaseFormat.LOWER_UNDERSCORE ? str.replace('-', '_') : caseFormat == CaseFormat.UPPER_UNDERSCORE ? Ascii.toUpperCase(str.replace('-', '_')) : super.h(caseFormat, str);
        }

        @Override // com.google.common.base.CaseFormat
        String k(String str) {
            return Ascii.toLowerCase(str);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ CaseFormat[] f28815d = d();

    private static final class StringConverter extends Converter<String, String> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final CaseFormat f28818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final CaseFormat f28819e;

        StringConverter(CaseFormat caseFormat, CaseFormat caseFormat2) {
            this.f28818d = (CaseFormat) Preconditions.checkNotNull(caseFormat);
            this.f28819e = (CaseFormat) Preconditions.checkNotNull(caseFormat2);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof StringConverter) {
                StringConverter stringConverter = (StringConverter) obj;
                if (this.f28818d.equals(stringConverter.f28818d) && this.f28819e.equals(stringConverter.f28819e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f28818d.hashCode() ^ this.f28819e.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public String d(String str) {
            return this.f28819e.to(this.f28818d, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String g(String str) {
            return this.f28818d.to(this.f28819e, str);
        }

        public String toString() {
            return this.f28818d + ".converterTo(" + this.f28819e + ")";
        }
    }

    static {
        String str = "_";
        LOWER_UNDERSCORE = new CaseFormat("LOWER_UNDERSCORE", 1, CharMatcher.is('_'), str) { // from class: com.google.common.base.CaseFormat.2
            @Override // com.google.common.base.CaseFormat
            String h(CaseFormat caseFormat, String str2) {
                return caseFormat == CaseFormat.LOWER_HYPHEN ? str2.replace('_', '-') : caseFormat == CaseFormat.UPPER_UNDERSCORE ? Ascii.toUpperCase(str2) : super.h(caseFormat, str2);
            }

            @Override // com.google.common.base.CaseFormat
            String k(String str2) {
                return Ascii.toLowerCase(str2);
            }
        };
        String str2 = "";
        LOWER_CAMEL = new CaseFormat("LOWER_CAMEL", 2, CharMatcher.inRange('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.3
            @Override // com.google.common.base.CaseFormat
            String j(String str3) {
                return Ascii.toLowerCase(str3);
            }

            @Override // com.google.common.base.CaseFormat
            String k(String str3) {
                return CaseFormat.i(str3);
            }
        };
        UPPER_CAMEL = new CaseFormat("UPPER_CAMEL", 3, CharMatcher.inRange('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.4
            @Override // com.google.common.base.CaseFormat
            String k(String str3) {
                return CaseFormat.i(str3);
            }
        };
        UPPER_UNDERSCORE = new CaseFormat("UPPER_UNDERSCORE", 4, CharMatcher.is('_'), str) { // from class: com.google.common.base.CaseFormat.5
            @Override // com.google.common.base.CaseFormat
            String h(CaseFormat caseFormat, String str3) {
                return caseFormat == CaseFormat.LOWER_HYPHEN ? Ascii.toLowerCase(str3.replace('_', '-')) : caseFormat == CaseFormat.LOWER_UNDERSCORE ? Ascii.toLowerCase(str3) : super.h(caseFormat, str3);
            }

            @Override // com.google.common.base.CaseFormat
            String k(String str3) {
                return Ascii.toUpperCase(str3);
            }
        };
    }

    private static /* synthetic */ CaseFormat[] d() {
        return new CaseFormat[]{LOWER_HYPHEN, LOWER_UNDERSCORE, LOWER_CAMEL, UPPER_CAMEL, UPPER_UNDERSCORE};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String i(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return Ascii.toUpperCase(str.charAt(0)) + Ascii.toLowerCase(str.substring(1));
    }

    public static CaseFormat valueOf(String str) {
        return (CaseFormat) Enum.valueOf(CaseFormat.class, str);
    }

    public static CaseFormat[] values() {
        return (CaseFormat[]) f28815d.clone();
    }

    public Converter<String, String> converterTo(CaseFormat caseFormat) {
        return new StringConverter(this, caseFormat);
    }

    String h(CaseFormat caseFormat, String str) {
        StringBuilder sb2 = null;
        int length = 0;
        int iIndexIn = -1;
        while (true) {
            iIndexIn = this.f28816b.indexIn(str, iIndexIn + 1);
            if (iIndexIn == -1) {
                break;
            }
            if (length == 0) {
                sb2 = new StringBuilder(str.length() + (caseFormat.f28817c.length() * 4));
                sb2.append(caseFormat.j(str.substring(length, iIndexIn)));
            } else {
                j$.util.Objects.requireNonNull(sb2);
                sb2.append(caseFormat.k(str.substring(length, iIndexIn)));
            }
            sb2.append(caseFormat.f28817c);
            length = this.f28817c.length() + iIndexIn;
        }
        if (length == 0) {
            return caseFormat.j(str);
        }
        j$.util.Objects.requireNonNull(sb2);
        sb2.append(caseFormat.k(str.substring(length)));
        return sb2.toString();
    }

    String j(String str) {
        return k(str);
    }

    abstract String k(String str);

    public final String to(CaseFormat caseFormat, String str) {
        Preconditions.checkNotNull(caseFormat);
        Preconditions.checkNotNull(str);
        return caseFormat == this ? str : h(caseFormat, str);
    }

    private CaseFormat(String str, int i10, CharMatcher charMatcher, String str2) {
        this.f28816b = charMatcher;
        this.f28817c = str2;
    }
}
