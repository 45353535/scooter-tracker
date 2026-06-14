package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class CLElement implements Cloneable {
    protected static int sBaseIndent = 2;
    protected static int sMaxLine = 80;
    protected CLContainer mContainer;
    private final char[] mContent;
    private int mLine;
    protected long mStart = -1;
    protected long mEnd = Long.MAX_VALUE;

    public CLElement(char[] cArr) {
        this.mContent = cArr;
    }

    protected void addIndent(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(' ');
        }
    }

    public String content() {
        String str = new String(this.mContent);
        if (str.length() < 1) {
            return "";
        }
        long j10 = this.mEnd;
        if (j10 != Long.MAX_VALUE) {
            long j11 = this.mStart;
            if (j10 >= j11) {
                return str.substring((int) j11, ((int) j10) + 1);
            }
        }
        long j12 = this.mStart;
        return str.substring((int) j12, ((int) j12) + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLElement)) {
            return false;
        }
        CLElement cLElement = (CLElement) obj;
        if (this.mStart == cLElement.mStart && this.mEnd == cLElement.mEnd && this.mLine == cLElement.mLine && Arrays.equals(this.mContent, cLElement.mContent)) {
            return Objects.equals(this.mContainer, cLElement.mContainer);
        }
        return false;
    }

    public CLElement getContainer() {
        return this.mContainer;
    }

    protected String getDebugName() {
        if (!CLParser.sDebug) {
            return "";
        }
        return getStrClass() + " -> ";
    }

    public long getEnd() {
        return this.mEnd;
    }

    public float getFloat() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getFloat();
        }
        return Float.NaN;
    }

    public int getInt() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getInt();
        }
        return 0;
    }

    public int getLine() {
        return this.mLine;
    }

    public long getStart() {
        return this.mStart;
    }

    protected String getStrClass() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public boolean hasContent() {
        char[] cArr = this.mContent;
        return cArr != null && cArr.length >= 1;
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.mContent) * 31;
        long j10 = this.mStart;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.mEnd;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        CLContainer cLContainer = this.mContainer;
        return ((i11 + (cLContainer != null ? cLContainer.hashCode() : 0)) * 31) + this.mLine;
    }

    public boolean isDone() {
        return this.mEnd != Long.MAX_VALUE;
    }

    public boolean isStarted() {
        return this.mStart > -1;
    }

    public boolean notStarted() {
        return this.mStart == -1;
    }

    public void setContainer(CLContainer cLContainer) {
        this.mContainer = cLContainer;
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public void setEnd(long j10) {
        if (this.mEnd != Long.MAX_VALUE) {
            return;
        }
        this.mEnd = j10;
        if (CLParser.sDebug) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        CLContainer cLContainer = this.mContainer;
        if (cLContainer != null) {
            cLContainer.add(this);
        }
    }

    public void setLine(int i10) {
        this.mLine = i10;
    }

    public void setStart(long j10) {
        this.mStart = j10;
    }

    protected String toFormattedJSON(int i10, int i11) {
        return "";
    }

    protected String toJSON() {
        return "";
    }

    public String toString() {
        long j10 = this.mStart;
        long j11 = this.mEnd;
        if (j10 > j11 || j11 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.mStart + TokenBuilder.TOKEN_DELIMITER + this.mEnd + ")";
        }
        return getStrClass() + " (" + this.mStart + " : " + this.mEnd + ") <<" + new String(this.mContent).substring((int) this.mStart, ((int) this.mEnd) + 1) + ">>";
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public CLElement mo4197clone() {
        try {
            return (CLElement) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
