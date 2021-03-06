// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/errors/asset_error.proto

package com.google.ads.googleads.v6.errors;

/**
 * <pre>
 * Container for enum describing possible asset errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v6.errors.AssetErrorEnum}
 */
public final class AssetErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v6.errors.AssetErrorEnum)
    AssetErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetErrorEnum.newBuilder() to construct.
  private AssetErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AssetErrorEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v6.errors.AssetErrorProto.internal_static_google_ads_googleads_v6_errors_AssetErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v6.errors.AssetErrorProto.internal_static_google_ads_googleads_v6_errors_AssetErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v6.errors.AssetErrorEnum.class, com.google.ads.googleads.v6.errors.AssetErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible asset errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v6.errors.AssetErrorEnum.AssetError}
   */
  public enum AssetError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The customer is not is not on the allow-list for this asset type.
     * </pre>
     *
     * <code>CUSTOMER_NOT_ON_ALLOWLIST_FOR_ASSET_TYPE = 13;</code>
     */
    CUSTOMER_NOT_ON_ALLOWLIST_FOR_ASSET_TYPE(13),
    /**
     * <pre>
     * Assets are duplicated across operations.
     * </pre>
     *
     * <code>DUPLICATE_ASSET = 3;</code>
     */
    DUPLICATE_ASSET(3),
    /**
     * <pre>
     * The asset name is duplicated, either across operations or with an
     * existing asset.
     * </pre>
     *
     * <code>DUPLICATE_ASSET_NAME = 4;</code>
     */
    DUPLICATE_ASSET_NAME(4),
    /**
     * <pre>
     * The Asset.asset_data oneof is empty.
     * </pre>
     *
     * <code>ASSET_DATA_IS_MISSING = 5;</code>
     */
    ASSET_DATA_IS_MISSING(5),
    /**
     * <pre>
     * The asset has a name which is different from an existing duplicate that
     * represents the same content.
     * </pre>
     *
     * <code>CANNOT_MODIFY_ASSET_NAME = 6;</code>
     */
    CANNOT_MODIFY_ASSET_NAME(6),
    /**
     * <pre>
     * The field cannot be set for this asset type.
     * </pre>
     *
     * <code>FIELD_INCOMPATIBLE_WITH_ASSET_TYPE = 7;</code>
     */
    FIELD_INCOMPATIBLE_WITH_ASSET_TYPE(7),
    /**
     * <pre>
     * Call to action must come from the list of supported values.
     * </pre>
     *
     * <code>INVALID_CALL_TO_ACTION_TEXT = 8;</code>
     */
    INVALID_CALL_TO_ACTION_TEXT(8),
    /**
     * <pre>
     * A lead form asset is created with an invalid combination of input fields.
     * </pre>
     *
     * <code>LEAD_FORM_INVALID_FIELDS_COMBINATION = 9;</code>
     */
    LEAD_FORM_INVALID_FIELDS_COMBINATION(9),
    /**
     * <pre>
     * Lead forms require that the Terms of Service have been agreed to before
     * mutates can be executed.
     * </pre>
     *
     * <code>LEAD_FORM_MISSING_AGREEMENT = 10;</code>
     */
    LEAD_FORM_MISSING_AGREEMENT(10),
    /**
     * <pre>
     * Asset status is invalid in this operation.
     * </pre>
     *
     * <code>INVALID_ASSET_STATUS = 11;</code>
     */
    INVALID_ASSET_STATUS(11),
    /**
     * <pre>
     * The field cannot be modified by this asset type.
     * </pre>
     *
     * <code>FIELD_CANNOT_BE_MODIFIED_FOR_ASSET_TYPE = 12;</code>
     */
    FIELD_CANNOT_BE_MODIFIED_FOR_ASSET_TYPE(12),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The customer is not is not on the allow-list for this asset type.
     * </pre>
     *
     * <code>CUSTOMER_NOT_ON_ALLOWLIST_FOR_ASSET_TYPE = 13;</code>
     */
    public static final int CUSTOMER_NOT_ON_ALLOWLIST_FOR_ASSET_TYPE_VALUE = 13;
    /**
     * <pre>
     * Assets are duplicated across operations.
     * </pre>
     *
     * <code>DUPLICATE_ASSET = 3;</code>
     */
    public static final int DUPLICATE_ASSET_VALUE = 3;
    /**
     * <pre>
     * The asset name is duplicated, either across operations or with an
     * existing asset.
     * </pre>
     *
     * <code>DUPLICATE_ASSET_NAME = 4;</code>
     */
    public static final int DUPLICATE_ASSET_NAME_VALUE = 4;
    /**
     * <pre>
     * The Asset.asset_data oneof is empty.
     * </pre>
     *
     * <code>ASSET_DATA_IS_MISSING = 5;</code>
     */
    public static final int ASSET_DATA_IS_MISSING_VALUE = 5;
    /**
     * <pre>
     * The asset has a name which is different from an existing duplicate that
     * represents the same content.
     * </pre>
     *
     * <code>CANNOT_MODIFY_ASSET_NAME = 6;</code>
     */
    public static final int CANNOT_MODIFY_ASSET_NAME_VALUE = 6;
    /**
     * <pre>
     * The field cannot be set for this asset type.
     * </pre>
     *
     * <code>FIELD_INCOMPATIBLE_WITH_ASSET_TYPE = 7;</code>
     */
    public static final int FIELD_INCOMPATIBLE_WITH_ASSET_TYPE_VALUE = 7;
    /**
     * <pre>
     * Call to action must come from the list of supported values.
     * </pre>
     *
     * <code>INVALID_CALL_TO_ACTION_TEXT = 8;</code>
     */
    public static final int INVALID_CALL_TO_ACTION_TEXT_VALUE = 8;
    /**
     * <pre>
     * A lead form asset is created with an invalid combination of input fields.
     * </pre>
     *
     * <code>LEAD_FORM_INVALID_FIELDS_COMBINATION = 9;</code>
     */
    public static final int LEAD_FORM_INVALID_FIELDS_COMBINATION_VALUE = 9;
    /**
     * <pre>
     * Lead forms require that the Terms of Service have been agreed to before
     * mutates can be executed.
     * </pre>
     *
     * <code>LEAD_FORM_MISSING_AGREEMENT = 10;</code>
     */
    public static final int LEAD_FORM_MISSING_AGREEMENT_VALUE = 10;
    /**
     * <pre>
     * Asset status is invalid in this operation.
     * </pre>
     *
     * <code>INVALID_ASSET_STATUS = 11;</code>
     */
    public static final int INVALID_ASSET_STATUS_VALUE = 11;
    /**
     * <pre>
     * The field cannot be modified by this asset type.
     * </pre>
     *
     * <code>FIELD_CANNOT_BE_MODIFIED_FOR_ASSET_TYPE = 12;</code>
     */
    public static final int FIELD_CANNOT_BE_MODIFIED_FOR_ASSET_TYPE_VALUE = 12;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AssetError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AssetError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 13: return CUSTOMER_NOT_ON_ALLOWLIST_FOR_ASSET_TYPE;
        case 3: return DUPLICATE_ASSET;
        case 4: return DUPLICATE_ASSET_NAME;
        case 5: return ASSET_DATA_IS_MISSING;
        case 6: return CANNOT_MODIFY_ASSET_NAME;
        case 7: return FIELD_INCOMPATIBLE_WITH_ASSET_TYPE;
        case 8: return INVALID_CALL_TO_ACTION_TEXT;
        case 9: return LEAD_FORM_INVALID_FIELDS_COMBINATION;
        case 10: return LEAD_FORM_MISSING_AGREEMENT;
        case 11: return INVALID_ASSET_STATUS;
        case 12: return FIELD_CANNOT_BE_MODIFIED_FOR_ASSET_TYPE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AssetError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AssetError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AssetError>() {
            public AssetError findValueByNumber(int number) {
              return AssetError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v6.errors.AssetErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AssetError[] VALUES = values();

    public static AssetError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AssetError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v6.errors.AssetErrorEnum.AssetError)
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v6.errors.AssetErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v6.errors.AssetErrorEnum other = (com.google.ads.googleads.v6.errors.AssetErrorEnum) obj;

    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v6.errors.AssetErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v6.errors.AssetErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.errors.AssetErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v6.errors.AssetErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.errors.AssetErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v6.errors.AssetErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.errors.AssetErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v6.errors.AssetErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.errors.AssetErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v6.errors.AssetErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.errors.AssetErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v6.errors.AssetErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v6.errors.AssetErrorEnum prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Container for enum describing possible asset errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v6.errors.AssetErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v6.errors.AssetErrorEnum)
      com.google.ads.googleads.v6.errors.AssetErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v6.errors.AssetErrorProto.internal_static_google_ads_googleads_v6_errors_AssetErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v6.errors.AssetErrorProto.internal_static_google_ads_googleads_v6_errors_AssetErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v6.errors.AssetErrorEnum.class, com.google.ads.googleads.v6.errors.AssetErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v6.errors.AssetErrorEnum.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v6.errors.AssetErrorProto.internal_static_google_ads_googleads_v6_errors_AssetErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v6.errors.AssetErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v6.errors.AssetErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v6.errors.AssetErrorEnum build() {
      com.google.ads.googleads.v6.errors.AssetErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v6.errors.AssetErrorEnum buildPartial() {
      com.google.ads.googleads.v6.errors.AssetErrorEnum result = new com.google.ads.googleads.v6.errors.AssetErrorEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v6.errors.AssetErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v6.errors.AssetErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v6.errors.AssetErrorEnum other) {
      if (other == com.google.ads.googleads.v6.errors.AssetErrorEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v6.errors.AssetErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v6.errors.AssetErrorEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v6.errors.AssetErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v6.errors.AssetErrorEnum)
  private static final com.google.ads.googleads.v6.errors.AssetErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v6.errors.AssetErrorEnum();
  }

  public static com.google.ads.googleads.v6.errors.AssetErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<AssetErrorEnum>() {
    @java.lang.Override
    public AssetErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AssetErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AssetErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v6.errors.AssetErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

