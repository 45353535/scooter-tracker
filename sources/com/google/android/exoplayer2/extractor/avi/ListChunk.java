package com.google.android.exoplayer2.extractor.avi;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;

/* JADX INFO: loaded from: classes7.dex */
final class ListChunk implements AviChunk {
    public final ImmutableList<AviChunk> children;
    private final int type;

    private ListChunk(int i10, ImmutableList<AviChunk> immutableList) {
        this.type = i10;
        this.children = immutableList;
    }

    @Nullable
    private static AviChunk createBox(int i10, int i11, ParsableByteArray parsableByteArray) {
        switch (i10) {
            case 1718776947:
                return StreamFormatChunk.parseFrom(i11, parsableByteArray);
            case 1751742049:
                return AviMainHeaderChunk.parseFrom(parsableByteArray);
            case 1752331379:
                return AviStreamHeaderChunk.parseFrom(parsableByteArray);
            case 1852994675:
                return StreamNameChunk.parseFrom(parsableByteArray);
            default:
                return null;
        }
    }

    public static ListChunk parseFrom(int i10, ParsableByteArray parsableByteArray) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int iLimit = parsableByteArray.limit();
        int trackType = -2;
        while (parsableByteArray.bytesLeft() > 8) {
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int position = parsableByteArray.getPosition() + parsableByteArray.readLittleEndianInt();
            parsableByteArray.setLimit(position);
            AviChunk from = littleEndianInt == 1414744396 ? parseFrom(parsableByteArray.readLittleEndianInt(), parsableByteArray) : createBox(littleEndianInt, trackType, parsableByteArray);
            if (from != null) {
                if (from.getType() == 1752331379) {
                    trackType = ((AviStreamHeaderChunk) from).getTrackType();
                }
                builder.add(from);
            }
            parsableByteArray.setPosition(position);
            parsableByteArray.setLimit(iLimit);
        }
        return new ListChunk(i10, builder.build());
    }

    @Nullable
    public <T extends AviChunk> T getChild(Class<T> cls) {
        UnmodifiableIterator<AviChunk> it = this.children.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public int getType() {
        return this.type;
    }
}
