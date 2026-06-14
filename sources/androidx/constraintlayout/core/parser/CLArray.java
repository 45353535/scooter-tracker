package androidx.constraintlayout.core.parser;

import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes.dex */
public class CLArray extends CLContainer {
    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLArray(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        String json = toJSON();
        if (i11 > 0 || json.length() + i10 >= CLElement.sMaxLine) {
            sb2.append("[\n");
            boolean z10 = true;
            for (CLElement cLElement : this.mElements) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(",\n");
                }
                addIndent(sb2, CLElement.sBaseIndent + i10);
                sb2.append(cLElement.toFormattedJSON(CLElement.sBaseIndent + i10, i11 - 1));
            }
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            addIndent(sb2, i10);
            sb2.append(C4240b4.j.f42674e);
        } else {
            sb2.append(json);
        }
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toJSON() {
        StringBuilder sb2 = new StringBuilder(getDebugName() + C4240b4.j.f42672d);
        boolean z10 = true;
        for (int i10 = 0; i10 < this.mElements.size(); i10++) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(this.mElements.get(i10).toJSON());
        }
        return ((Object) sb2) + C4240b4.j.f42674e;
    }
}
