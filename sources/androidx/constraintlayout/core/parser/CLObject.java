package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class CLObject extends CLContainer implements Iterable<CLKey> {

    private static class CLObjectIterator implements Iterator<CLKey> {
        int mIndex = 0;
        CLObject mObject;

        CLObjectIterator(CLObject cLObject) {
            this.mObject = cLObject;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mIndex < this.mObject.size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public CLKey next() {
            CLKey cLKey = (CLKey) this.mObject.mElements.get(this.mIndex);
            this.mIndex++;
            return cLKey;
        }
    }

    public CLObject(char[] cArr) {
        super(cArr);
    }

    public static CLObject allocate(char[] cArr) {
        return new CLObject(cArr);
    }

    @Override // java.lang.Iterable
    public Iterator<CLKey> iterator() {
        return new CLObjectIterator(this);
    }

    public String toFormattedJSON() {
        return toFormattedJSON(0, 0);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb2 = new StringBuilder(getDebugName() + "{ ");
        boolean z10 = true;
        for (CLElement cLElement : this.mElements) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(cLElement.toJSON());
        }
        sb2.append(" }");
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(getDebugName());
        sb2.append("{\n");
        boolean z10 = true;
        for (CLElement cLElement : this.mElements) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(",\n");
            }
            sb2.append(cLElement.toFormattedJSON(CLElement.sBaseIndent + i10, i11 - 1));
        }
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        addIndent(sb2, i10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    @NonNull
    /* JADX INFO: renamed from: clone */
    public CLObject mo4197clone() {
        return (CLObject) super.mo4197clone();
    }
}
