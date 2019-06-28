// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/multiplier_error.proto

package com.google.ads.googleads.v1.errors;

/**
 * <pre>
 * Container for enum describing possible multiplier errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.errors.MultiplierErrorEnum}
 */
public  final class MultiplierErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.errors.MultiplierErrorEnum)
    MultiplierErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiplierErrorEnum.newBuilder() to construct.
  private MultiplierErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiplierErrorEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiplierErrorEnum(
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
            if (!parseUnknownFieldProto3(
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
    return com.google.ads.googleads.v1.errors.MultiplierErrorProto.internal_static_google_ads_googleads_v1_errors_MultiplierErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.errors.MultiplierErrorProto.internal_static_google_ads_googleads_v1_errors_MultiplierErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.errors.MultiplierErrorEnum.class, com.google.ads.googleads.v1.errors.MultiplierErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible multiplier errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v1.errors.MultiplierErrorEnum.MultiplierError}
   */
  public enum MultiplierError
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
     * Multiplier value is too high
     * </pre>
     *
     * <code>MULTIPLIER_TOO_HIGH = 2;</code>
     */
    MULTIPLIER_TOO_HIGH(2),
    /**
     * <pre>
     * Multiplier value is too low
     * </pre>
     *
     * <code>MULTIPLIER_TOO_LOW = 3;</code>
     */
    MULTIPLIER_TOO_LOW(3),
    /**
     * <pre>
     * Too many fractional digits
     * </pre>
     *
     * <code>TOO_MANY_FRACTIONAL_DIGITS = 4;</code>
     */
    TOO_MANY_FRACTIONAL_DIGITS(4),
    /**
     * <pre>
     * A multiplier cannot be set for this bidding strategy
     * </pre>
     *
     * <code>MULTIPLIER_NOT_ALLOWED_FOR_BIDDING_STRATEGY = 5;</code>
     */
    MULTIPLIER_NOT_ALLOWED_FOR_BIDDING_STRATEGY(5),
    /**
     * <pre>
     * A multiplier cannot be set when there is no base bid (e.g., content max
     * cpc)
     * </pre>
     *
     * <code>MULTIPLIER_NOT_ALLOWED_WHEN_BASE_BID_IS_MISSING = 6;</code>
     */
    MULTIPLIER_NOT_ALLOWED_WHEN_BASE_BID_IS_MISSING(6),
    /**
     * <pre>
     * A bid multiplier must be specified
     * </pre>
     *
     * <code>NO_MULTIPLIER_SPECIFIED = 7;</code>
     */
    NO_MULTIPLIER_SPECIFIED(7),
    /**
     * <pre>
     * Multiplier causes bid to exceed daily budget
     * </pre>
     *
     * <code>MULTIPLIER_CAUSES_BID_TO_EXCEED_DAILY_BUDGET = 8;</code>
     */
    MULTIPLIER_CAUSES_BID_TO_EXCEED_DAILY_BUDGET(8),
    /**
     * <pre>
     * Multiplier causes bid to exceed monthly budget
     * </pre>
     *
     * <code>MULTIPLIER_CAUSES_BID_TO_EXCEED_MONTHLY_BUDGET = 9;</code>
     */
    MULTIPLIER_CAUSES_BID_TO_EXCEED_MONTHLY_BUDGET(9),
    /**
     * <pre>
     * Multiplier causes bid to exceed custom budget
     * </pre>
     *
     * <code>MULTIPLIER_CAUSES_BID_TO_EXCEED_CUSTOM_BUDGET = 10;</code>
     */
    MULTIPLIER_CAUSES_BID_TO_EXCEED_CUSTOM_BUDGET(10),
    /**
     * <pre>
     * Multiplier causes bid to exceed maximum allowed bid
     * </pre>
     *
     * <code>MULTIPLIER_CAUSES_BID_TO_EXCEED_MAX_ALLOWED_BID = 11;</code>
     */
    MULTIPLIER_CAUSES_BID_TO_EXCEED_MAX_ALLOWED_BID(11),
    /**
     * <pre>
     * Multiplier causes bid to become less than the minimum bid allowed
     * </pre>
     *
     * <code>BID_LESS_THAN_MIN_ALLOWED_BID_WITH_MULTIPLIER = 12;</code>
     */
    BID_LESS_THAN_MIN_ALLOWED_BID_WITH_MULTIPLIER(12),
    /**
     * <pre>
     * Multiplier type (cpc vs. cpm) needs to match campaign's bidding strategy
     * </pre>
     *
     * <code>MULTIPLIER_AND_BIDDING_STRATEGY_TYPE_MISMATCH = 13;</code>
     */
    MULTIPLIER_AND_BIDDING_STRATEGY_TYPE_MISMATCH(13),
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
     * Multiplier value is too high
     * </pre>
     *
     * <code>MULTIPLIER_TOO_HIGH = 2;</code>
     */
    public static final int MULTIPLIER_TOO_HIGH_VALUE = 2;
    /**
     * <pre>
     * Multiplier value is too low
     * </pre>
     *
     * <code>MULTIPLIER_TOO_LOW = 3;</code>
     */
    public static final int MULTIPLIER_TOO_LOW_VALUE = 3;
    /**
     * <pre>
     * Too many fractional digits
     * </pre>
     *
     * <code>TOO_MANY_FRACTIONAL_DIGITS = 4;</code>
     */
    public static final int TOO_MANY_FRACTIONAL_DIGITS_VALUE = 4;
    /**
     * <pre>
     * A multiplier cannot be set for this bidding strategy
     * </pre>
     *
     * <code>MULTIPLIER_NOT_ALLOWED_FOR_BIDDING_STRATEGY = 5;</code>
     */
    public static final int MULTIPLIER_NOT_ALLOWED_FOR_BIDDING_STRATEGY_VALUE = 5;
    /**
     * <pre>
     * A multiplier cannot be set when there is no base bid (e.g., content max
     * cpc)
     * </pre>
     *
     * <code>MULTIPLIER_NOT_ALLOWED_WHEN_BASE_BID_IS_MISSING = 6;</code>
     */
    public static final int MULTIPLIER_NOT_ALLOWED_WHEN_BASE_BID_IS_MISSING_VALUE = 6;
    /**
     * <pre>
     * A bid multiplier must be specified
     * </pre>
     *
     * <code>NO_MULTIPLIER_SPECIFIED = 7;</code>
     */
    public static final int NO_MULTIPLIER_SPECIFIED_VALUE = 7;
    /**
     * <pre>
     * Multiplier causes bid to exceed daily budget
     * </pre>
     *
     * <code>MULTIPLIER_CAUSES_BID_TO_EXCEED_DAILY_BUDGET = 8;</code>
     */
    public static final int MULTIPLIER_CAUSES_BID_TO_EXCEED_DAILY_BUDGET_VALUE = 8;
    /**
     * <pre>
     * Multiplier causes bid to exceed monthly budget
     * </pre>
     *
     * <code>MULTIPLIER_CAUSES_BID_TO_EXCEED_MONTHLY_BUDGET = 9;</code>
     */
    public static final int MULTIPLIER_CAUSES_BID_TO_EXCEED_MONTHLY_BUDGET_VALUE = 9;
    /**
     * <pre>
     * Multiplier causes bid to exceed custom budget
     * </pre>
     *
     * <code>MULTIPLIER_CAUSES_BID_TO_EXCEED_CUSTOM_BUDGET = 10;</code>
     */
    public static final int MULTIPLIER_CAUSES_BID_TO_EXCEED_CUSTOM_BUDGET_VALUE = 10;
    /**
     * <pre>
     * Multiplier causes bid to exceed maximum allowed bid
     * </pre>
     *
     * <code>MULTIPLIER_CAUSES_BID_TO_EXCEED_MAX_ALLOWED_BID = 11;</code>
     */
    public static final int MULTIPLIER_CAUSES_BID_TO_EXCEED_MAX_ALLOWED_BID_VALUE = 11;
    /**
     * <pre>
     * Multiplier causes bid to become less than the minimum bid allowed
     * </pre>
     *
     * <code>BID_LESS_THAN_MIN_ALLOWED_BID_WITH_MULTIPLIER = 12;</code>
     */
    public static final int BID_LESS_THAN_MIN_ALLOWED_BID_WITH_MULTIPLIER_VALUE = 12;
    /**
     * <pre>
     * Multiplier type (cpc vs. cpm) needs to match campaign's bidding strategy
     * </pre>
     *
     * <code>MULTIPLIER_AND_BIDDING_STRATEGY_TYPE_MISMATCH = 13;</code>
     */
    public static final int MULTIPLIER_AND_BIDDING_STRATEGY_TYPE_MISMATCH_VALUE = 13;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MultiplierError valueOf(int value) {
      return forNumber(value);
    }

    public static MultiplierError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return MULTIPLIER_TOO_HIGH;
        case 3: return MULTIPLIER_TOO_LOW;
        case 4: return TOO_MANY_FRACTIONAL_DIGITS;
        case 5: return MULTIPLIER_NOT_ALLOWED_FOR_BIDDING_STRATEGY;
        case 6: return MULTIPLIER_NOT_ALLOWED_WHEN_BASE_BID_IS_MISSING;
        case 7: return NO_MULTIPLIER_SPECIFIED;
        case 8: return MULTIPLIER_CAUSES_BID_TO_EXCEED_DAILY_BUDGET;
        case 9: return MULTIPLIER_CAUSES_BID_TO_EXCEED_MONTHLY_BUDGET;
        case 10: return MULTIPLIER_CAUSES_BID_TO_EXCEED_CUSTOM_BUDGET;
        case 11: return MULTIPLIER_CAUSES_BID_TO_EXCEED_MAX_ALLOWED_BID;
        case 12: return BID_LESS_THAN_MIN_ALLOWED_BID_WITH_MULTIPLIER;
        case 13: return MULTIPLIER_AND_BIDDING_STRATEGY_TYPE_MISMATCH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MultiplierError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MultiplierError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MultiplierError>() {
            public MultiplierError findValueByNumber(int number) {
              return MultiplierError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.errors.MultiplierErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final MultiplierError[] VALUES = values();

    public static MultiplierError valueOf(
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

    private MultiplierError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v1.errors.MultiplierErrorEnum.MultiplierError)
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
    if (!(obj instanceof com.google.ads.googleads.v1.errors.MultiplierErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.errors.MultiplierErrorEnum other = (com.google.ads.googleads.v1.errors.MultiplierErrorEnum) obj;

    boolean result = true;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
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

  public static com.google.ads.googleads.v1.errors.MultiplierErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.MultiplierErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.MultiplierErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.MultiplierErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.MultiplierErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.MultiplierErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.MultiplierErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.MultiplierErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.MultiplierErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.MultiplierErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.MultiplierErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.MultiplierErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.errors.MultiplierErrorEnum prototype) {
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
   * Container for enum describing possible multiplier errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.errors.MultiplierErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.errors.MultiplierErrorEnum)
      com.google.ads.googleads.v1.errors.MultiplierErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.errors.MultiplierErrorProto.internal_static_google_ads_googleads_v1_errors_MultiplierErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.errors.MultiplierErrorProto.internal_static_google_ads_googleads_v1_errors_MultiplierErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.errors.MultiplierErrorEnum.class, com.google.ads.googleads.v1.errors.MultiplierErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.errors.MultiplierErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v1.errors.MultiplierErrorProto.internal_static_google_ads_googleads_v1_errors_MultiplierErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.MultiplierErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.errors.MultiplierErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.MultiplierErrorEnum build() {
      com.google.ads.googleads.v1.errors.MultiplierErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.MultiplierErrorEnum buildPartial() {
      com.google.ads.googleads.v1.errors.MultiplierErrorEnum result = new com.google.ads.googleads.v1.errors.MultiplierErrorEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v1.errors.MultiplierErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v1.errors.MultiplierErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.errors.MultiplierErrorEnum other) {
      if (other == com.google.ads.googleads.v1.errors.MultiplierErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v1.errors.MultiplierErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.errors.MultiplierErrorEnum) e.getUnfinishedMessage();
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
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.errors.MultiplierErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.errors.MultiplierErrorEnum)
  private static final com.google.ads.googleads.v1.errors.MultiplierErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.errors.MultiplierErrorEnum();
  }

  public static com.google.ads.googleads.v1.errors.MultiplierErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiplierErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<MultiplierErrorEnum>() {
    @java.lang.Override
    public MultiplierErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiplierErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiplierErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiplierErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.errors.MultiplierErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

