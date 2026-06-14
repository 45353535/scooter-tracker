package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Constraint;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Helper {
    protected static final Map<Constraint.Side, String> sideMap;
    protected static final Map<Type, String> typeMap;
    protected String config;
    protected Map<String, String> configMap;
    protected final String name;
    protected HelperType type;

    public static final class HelperType {
        final String mName;

        public HelperType(String str) {
            this.mName = str;
        }

        public String toString() {
            return this.mName;
        }
    }

    public enum Type {
        VERTICAL_GUIDELINE,
        HORIZONTAL_GUIDELINE,
        VERTICAL_CHAIN,
        HORIZONTAL_CHAIN,
        BARRIER
    }

    static {
        HashMap map = new HashMap();
        sideMap = map;
        map.put(Constraint.Side.LEFT, "'left'");
        map.put(Constraint.Side.RIGHT, "'right'");
        map.put(Constraint.Side.TOP, "'top'");
        map.put(Constraint.Side.BOTTOM, "'bottom'");
        map.put(Constraint.Side.START, "'start'");
        map.put(Constraint.Side.END, "'end'");
        map.put(Constraint.Side.BASELINE, "'baseline'");
        HashMap map2 = new HashMap();
        typeMap = map2;
        map2.put(Type.VERTICAL_GUIDELINE, "vGuideline");
        map2.put(Type.HORIZONTAL_GUIDELINE, "hGuideline");
        map2.put(Type.VERTICAL_CHAIN, "vChain");
        map2.put(Type.HORIZONTAL_CHAIN, "hChain");
        map2.put(Type.BARRIER, "barrier");
    }

    public Helper(String str, HelperType helperType) {
        this.type = null;
        this.configMap = new HashMap();
        this.name = str;
        this.type = helperType;
    }

    public static void main(String[] strArr) {
        System.out.println(new Barrier("abc", "['a1', 'b2']").toString());
    }

    public void append(Map<String, String> map, StringBuilder sb2) {
        if (map.isEmpty()) {
            return;
        }
        for (String str : map.keySet()) {
            sb2.append(str);
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(map.get(str));
            sb2.append(",\n");
        }
    }

    public Map<String, String> convertConfigToMap() {
        String str = this.config;
        if (str == null || str.length() == 0) {
            return null;
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        String string = "";
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.config.length(); i12++) {
            char cCharAt = this.config.charAt(i12);
            if (cCharAt == ':') {
                string = sb2.toString();
                sb2.setLength(0);
            } else if (cCharAt == ',' && i10 == 0 && i11 == 0) {
                map.put(string, sb2.toString());
                sb2.setLength(0);
                string = "";
            } else if (cCharAt != ' ') {
                if (cCharAt == '[') {
                    i10++;
                } else if (cCharAt == ']') {
                    i10--;
                } else if (cCharAt == '{') {
                    i11++;
                } else if (cCharAt == '}') {
                    i11--;
                }
                sb2.append(cCharAt);
            }
        }
        map.put(string, sb2.toString());
        return map;
    }

    public String getConfig() {
        return this.config;
    }

    public String getId() {
        return this.name;
    }

    public HelperType getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.name + ":{\n");
        if (this.type != null) {
            sb2.append("type:'");
            sb2.append(this.type.toString());
            sb2.append("',\n");
        }
        Map<String, String> map = this.configMap;
        if (map != null) {
            append(map, sb2);
        }
        sb2.append("},\n");
        return sb2.toString();
    }

    public Helper(String str, HelperType helperType, String str2) {
        this.type = null;
        this.configMap = new HashMap();
        this.name = str;
        this.type = helperType;
        this.config = str2;
        this.configMap = convertConfigToMap();
    }
}
