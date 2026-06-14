package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class CLString extends CLElement {
    public CLString(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLString(cArr);
    }

    @NonNull
    public static CLString from(@NonNull String str) {
        CLString cLString = new CLString(str.toCharArray());
        cLString.setStart(0L);
        cLString.setEnd(str.length() - 1);
        return cLString;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CLString) && content().equals(((CLString) obj).content())) {
            return true;
        }
        return super.equals(obj);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        addIndent(sb2, i10);
        sb2.append("'");
        sb2.append(content());
        sb2.append("'");
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toJSON() {
        return "'" + content() + "'";
    }
}
