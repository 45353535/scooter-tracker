package net.pubnative.lite.sdk.utils.string;

import androidx.webkit.ProxyConfig;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import j$.util.DesugarCollections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class StringEscapeUtils {
    public static final String EMPTY = "";
    public static final CharSequenceTranslator ESCAPE_JAVA;
    public static final CharSequenceTranslator ESCAPE_XSI;
    public static final CharSequenceTranslator UNESCAPE_JAVA;

    public static final class Builder {

        /* JADX INFO: renamed from: sb, reason: collision with root package name */
        private final StringBuilder f95979sb;
        private final CharSequenceTranslator translator;

        public Builder append(String str) {
            this.f95979sb.append(str);
            return this;
        }

        public Builder escape(String str) {
            this.f95979sb.append(this.translator.translate(str));
            return this;
        }

        public String toString() {
            return this.f95979sb.toString();
        }

        private Builder(CharSequenceTranslator charSequenceTranslator) {
            this.f95979sb = new StringBuilder();
            this.translator = charSequenceTranslator;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("\"", "\\\"");
        map.put("\\", "\\\\");
        ESCAPE_JAVA = new AggregateTranslator(new LookupTranslator(DesugarCollections.unmodifiableMap(map)), new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_ESCAPE), JavaUnicodeEscaper.outsideOf(32, 127));
        HashMap map2 = new HashMap();
        map2.put("|", "\\|");
        map2.put(C4240b4.j.f42670c, "\\&");
        map2.put(";", "\\;");
        map2.put("<", "\\<");
        map2.put(">", "\\>");
        map2.put("(", "\\(");
        map2.put(")", "\\)");
        map2.put("$", "\\$");
        map2.put("`", "\\`");
        map2.put("\\", "\\\\");
        map2.put("\"", "\\\"");
        map2.put("'", "\\'");
        map2.put(" ", "\\ ");
        map2.put("\t", "\\\t");
        map2.put(IOUtils.LINE_SEPARATOR_WINDOWS, "");
        map2.put(IOUtils.LINE_SEPARATOR_UNIX, "");
        map2.put(ProxyConfig.MATCH_ALL_SCHEMES, "\\*");
        map2.put("?", "\\?");
        map2.put(C4240b4.j.f42672d, "\\[");
        map2.put("#", "\\#");
        map2.put("~", "\\~");
        map2.put(C4240b4.j.f42668b, "\\=");
        map2.put("%", "\\%");
        ESCAPE_XSI = new LookupTranslator(DesugarCollections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        map3.put("\\\\", "\\");
        map3.put("\\\"", "\"");
        map3.put("\\'", "'");
        map3.put("\\", "");
        UNESCAPE_JAVA = new AggregateTranslator(new OctalUnescaper(), new UnicodeUnescaper(), new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_UNESCAPE), new LookupTranslator(DesugarCollections.unmodifiableMap(map3)));
    }

    public static Builder builder(CharSequenceTranslator charSequenceTranslator) {
        return new Builder(charSequenceTranslator);
    }

    public static final String escapeJava(String str) {
        return ESCAPE_JAVA.translate(str);
    }

    public static final String unescapeJava(String str) {
        return UNESCAPE_JAVA.translate(str);
    }
}
