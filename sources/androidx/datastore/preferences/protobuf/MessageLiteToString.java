package androidx.datastore.preferences.protobuf;

import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class MessageLiteToString {
    private static final String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final String BYTES_SUFFIX = "Bytes";
    private static final char[] INDENT_BUFFER;
    private static final String LIST_SUFFIX = "List";
    private static final String MAP_SUFFIX = "Map";

    static {
        char[] cArr = new char[80];
        INDENT_BUFFER = cArr;
        Arrays.fill(cArr, ' ');
    }

    private MessageLiteToString() {
    }

    private static void indent(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            char[] cArr = INDENT_BUFFER;
            int length = i10 > cArr.length ? cArr.length : i10;
            sb2.append(cArr, 0, length);
            i10 -= length;
        }
    }

    private static boolean isDefaultValue(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? Float.floatToRawIntBits(((Float) obj).floatValue()) == 0 : obj instanceof Double ? Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0 : obj instanceof String ? obj.equals("") : obj instanceof ByteString ? obj.equals(ByteString.EMPTY) : obj instanceof MessageLite ? obj == ((MessageLite) obj).getDefaultInstanceForType() : (obj instanceof java.lang.Enum) && ((java.lang.Enum) obj).ordinal() == 0;
    }

    private static String pascalCaseToSnakeCase(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Character.toLowerCase(str.charAt(0)));
        for (int i10 = 1; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    static void printField(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                printField(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                printField(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        indent(i10, sb2);
        sb2.append(pascalCaseToSnakeCase(str));
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(TextFormatEscaper.escapeText((String) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb2.append(": \"");
            sb2.append(TextFormatEscaper.escapeBytes((ByteString) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb2.append(" {");
            reflectivePrintWithIndent((GeneratedMessageLite) obj, sb2, i10 + 2);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            indent(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i11 = i10 + 2;
        printField(sb2, i11, C4240b4.i.W, entry.getKey());
        printField(sb2, i11, "value", entry.getValue());
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        indent(i10, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void reflectivePrintWithIndent(androidx.datastore.preferences.protobuf.MessageLite r17, java.lang.StringBuilder r18, int r19) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageLiteToString.reflectivePrintWithIndent(androidx.datastore.preferences.protobuf.MessageLite, java.lang.StringBuilder, int):void");
    }

    static String toString(MessageLite messageLite, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        reflectivePrintWithIndent(messageLite, sb2, 0);
        return sb2.toString();
    }
}
