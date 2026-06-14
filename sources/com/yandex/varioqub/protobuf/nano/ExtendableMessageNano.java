package com.yandex.varioqub.protobuf.nano;

import com.yandex.varioqub.protobuf.nano.ExtendableMessageNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ExtendableMessageNano<M extends ExtendableMessageNano<M>> extends MessageNano {
    protected FieldArray unknownFieldData;

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    protected int computeSerializedSize() {
        if (this.unknownFieldData == null) {
            return 0;
        }
        int iComputeSerializedSize = 0;
        for (int i10 = 0; i10 < this.unknownFieldData.size(); i10++) {
            iComputeSerializedSize += this.unknownFieldData.dataAt(i10).computeSerializedSize();
        }
        return iComputeSerializedSize;
    }

    public final <T> T getExtension(Extension<M, T> extension) {
        FieldData fieldData;
        FieldArray fieldArray = this.unknownFieldData;
        if (fieldArray == null || (fieldData = fieldArray.get(WireFormatNano.getTagFieldNumber(extension.tag))) == null) {
            return null;
        }
        return (T) fieldData.getValue(extension);
    }

    public final boolean hasExtension(Extension<M, ?> extension) {
        FieldArray fieldArray = this.unknownFieldData;
        return (fieldArray == null || fieldArray.get(WireFormatNano.getTagFieldNumber(extension.tag)) == null) ? false : true;
    }

    public final <T> M setExtension(Extension<M, T> extension, T t10) {
        int tagFieldNumber = WireFormatNano.getTagFieldNumber(extension.tag);
        FieldData fieldData = null;
        if (t10 == null) {
            FieldArray fieldArray = this.unknownFieldData;
            if (fieldArray != null) {
                fieldArray.remove(tagFieldNumber);
                if (this.unknownFieldData.isEmpty()) {
                    this.unknownFieldData = null;
                }
            }
            return this;
        }
        FieldArray fieldArray2 = this.unknownFieldData;
        if (fieldArray2 == null) {
            this.unknownFieldData = new FieldArray();
        } else {
            fieldData = fieldArray2.get(tagFieldNumber);
        }
        if (fieldData == null) {
            this.unknownFieldData.put(tagFieldNumber, new FieldData(extension, t10));
            return this;
        }
        fieldData.setValue(extension, t10);
        return this;
    }

    protected final boolean storeUnknownField(CodedInputByteBufferNano codedInputByteBufferNano, int i10) throws IOException {
        FieldData fieldData;
        int position = codedInputByteBufferNano.getPosition();
        if (!codedInputByteBufferNano.skipField(i10)) {
            return false;
        }
        int tagFieldNumber = WireFormatNano.getTagFieldNumber(i10);
        UnknownFieldData unknownFieldData = new UnknownFieldData(i10, codedInputByteBufferNano.getData(position, codedInputByteBufferNano.getPosition() - position));
        FieldArray fieldArray = this.unknownFieldData;
        if (fieldArray == null) {
            this.unknownFieldData = new FieldArray();
            fieldData = null;
        } else {
            fieldData = fieldArray.get(tagFieldNumber);
        }
        if (fieldData == null) {
            fieldData = new FieldData();
            this.unknownFieldData.put(tagFieldNumber, fieldData);
        }
        fieldData.addUnknownField(unknownFieldData);
        return true;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.unknownFieldData == null) {
            return;
        }
        for (int i10 = 0; i10 < this.unknownFieldData.size(); i10++) {
            this.unknownFieldData.dataAt(i10).writeTo(codedOutputByteBufferNano);
        }
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public M mo7678clone() throws CloneNotSupportedException {
        M m10 = (M) super.mo7678clone();
        InternalNano.cloneUnknownFieldData(this, m10);
        return m10;
    }
}
