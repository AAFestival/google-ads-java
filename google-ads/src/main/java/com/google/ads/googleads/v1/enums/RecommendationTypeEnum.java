// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/enums/recommendation_type.proto

package com.google.ads.googleads.v1.enums;

/**
 * <pre>
 * Container for enum describing types of recommendations.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.enums.RecommendationTypeEnum}
 */
public  final class RecommendationTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.enums.RecommendationTypeEnum)
    RecommendationTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecommendationTypeEnum.newBuilder() to construct.
  private RecommendationTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecommendationTypeEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RecommendationTypeEnum(
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
    return com.google.ads.googleads.v1.enums.RecommendationTypeProto.internal_static_google_ads_googleads_v1_enums_RecommendationTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.enums.RecommendationTypeProto.internal_static_google_ads_googleads_v1_enums_RecommendationTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.enums.RecommendationTypeEnum.class, com.google.ads.googleads.v1.enums.RecommendationTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Types of recommendations.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v1.enums.RecommendationTypeEnum.RecommendationType}
   */
  public enum RecommendationType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Budget recommendation for budget constrained campaigns.
     * </pre>
     *
     * <code>CAMPAIGN_BUDGET = 2;</code>
     */
    CAMPAIGN_BUDGET(2),
    /**
     * <pre>
     * Keyword recommendation.
     * </pre>
     *
     * <code>KEYWORD = 3;</code>
     */
    KEYWORD(3),
    /**
     * <pre>
     * Recommendation to add a new text ad.
     * </pre>
     *
     * <code>TEXT_AD = 4;</code>
     */
    TEXT_AD(4),
    /**
     * <pre>
     * Recommendation to update a campaign to use a Target CPA bidding strategy.
     * </pre>
     *
     * <code>TARGET_CPA_OPT_IN = 5;</code>
     */
    TARGET_CPA_OPT_IN(5),
    /**
     * <pre>
     * Recommendation to update a campaign to use the Maximize Conversions
     * bidding strategy.
     * </pre>
     *
     * <code>MAXIMIZE_CONVERSIONS_OPT_IN = 6;</code>
     */
    MAXIMIZE_CONVERSIONS_OPT_IN(6),
    /**
     * <pre>
     * Recommendation to enable Enhanced Cost Per Click for a campaign.
     * </pre>
     *
     * <code>ENHANCED_CPC_OPT_IN = 7;</code>
     */
    ENHANCED_CPC_OPT_IN(7),
    /**
     * <pre>
     * Recommendation to start showing your campaign's ads on Google Search
     * Partners Websites.
     * </pre>
     *
     * <code>SEARCH_PARTNERS_OPT_IN = 8;</code>
     */
    SEARCH_PARTNERS_OPT_IN(8),
    /**
     * <pre>
     * Recommendation to update a campaign to use a Maximize Clicks bidding
     * strategy.
     * </pre>
     *
     * <code>MAXIMIZE_CLICKS_OPT_IN = 9;</code>
     */
    MAXIMIZE_CLICKS_OPT_IN(9),
    /**
     * <pre>
     * Recommendation to start using the "Optimize" ad rotation setting for the
     * given ad group.
     * </pre>
     *
     * <code>OPTIMIZE_AD_ROTATION = 10;</code>
     */
    OPTIMIZE_AD_ROTATION(10),
    /**
     * <pre>
     * Recommendation to add callout extensions to a campaign.
     * </pre>
     *
     * <code>CALLOUT_EXTENSION = 11;</code>
     */
    CALLOUT_EXTENSION(11),
    /**
     * <pre>
     * Recommendation to add sitelink extensions to a campaign.
     * </pre>
     *
     * <code>SITELINK_EXTENSION = 12;</code>
     */
    SITELINK_EXTENSION(12),
    /**
     * <pre>
     * Recommendation to add call extensions to a campaign.
     * </pre>
     *
     * <code>CALL_EXTENSION = 13;</code>
     */
    CALL_EXTENSION(13),
    /**
     * <pre>
     * Recommendation to change an existing keyword from one match type to a
     * broader match type.
     * </pre>
     *
     * <code>KEYWORD_MATCH_TYPE = 14;</code>
     */
    KEYWORD_MATCH_TYPE(14),
    /**
     * <pre>
     * Recommendation to move unused budget from one budget to a constrained
     * budget.
     * </pre>
     *
     * <code>MOVE_UNUSED_BUDGET = 15;</code>
     */
    MOVE_UNUSED_BUDGET(15),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Budget recommendation for budget constrained campaigns.
     * </pre>
     *
     * <code>CAMPAIGN_BUDGET = 2;</code>
     */
    public static final int CAMPAIGN_BUDGET_VALUE = 2;
    /**
     * <pre>
     * Keyword recommendation.
     * </pre>
     *
     * <code>KEYWORD = 3;</code>
     */
    public static final int KEYWORD_VALUE = 3;
    /**
     * <pre>
     * Recommendation to add a new text ad.
     * </pre>
     *
     * <code>TEXT_AD = 4;</code>
     */
    public static final int TEXT_AD_VALUE = 4;
    /**
     * <pre>
     * Recommendation to update a campaign to use a Target CPA bidding strategy.
     * </pre>
     *
     * <code>TARGET_CPA_OPT_IN = 5;</code>
     */
    public static final int TARGET_CPA_OPT_IN_VALUE = 5;
    /**
     * <pre>
     * Recommendation to update a campaign to use the Maximize Conversions
     * bidding strategy.
     * </pre>
     *
     * <code>MAXIMIZE_CONVERSIONS_OPT_IN = 6;</code>
     */
    public static final int MAXIMIZE_CONVERSIONS_OPT_IN_VALUE = 6;
    /**
     * <pre>
     * Recommendation to enable Enhanced Cost Per Click for a campaign.
     * </pre>
     *
     * <code>ENHANCED_CPC_OPT_IN = 7;</code>
     */
    public static final int ENHANCED_CPC_OPT_IN_VALUE = 7;
    /**
     * <pre>
     * Recommendation to start showing your campaign's ads on Google Search
     * Partners Websites.
     * </pre>
     *
     * <code>SEARCH_PARTNERS_OPT_IN = 8;</code>
     */
    public static final int SEARCH_PARTNERS_OPT_IN_VALUE = 8;
    /**
     * <pre>
     * Recommendation to update a campaign to use a Maximize Clicks bidding
     * strategy.
     * </pre>
     *
     * <code>MAXIMIZE_CLICKS_OPT_IN = 9;</code>
     */
    public static final int MAXIMIZE_CLICKS_OPT_IN_VALUE = 9;
    /**
     * <pre>
     * Recommendation to start using the "Optimize" ad rotation setting for the
     * given ad group.
     * </pre>
     *
     * <code>OPTIMIZE_AD_ROTATION = 10;</code>
     */
    public static final int OPTIMIZE_AD_ROTATION_VALUE = 10;
    /**
     * <pre>
     * Recommendation to add callout extensions to a campaign.
     * </pre>
     *
     * <code>CALLOUT_EXTENSION = 11;</code>
     */
    public static final int CALLOUT_EXTENSION_VALUE = 11;
    /**
     * <pre>
     * Recommendation to add sitelink extensions to a campaign.
     * </pre>
     *
     * <code>SITELINK_EXTENSION = 12;</code>
     */
    public static final int SITELINK_EXTENSION_VALUE = 12;
    /**
     * <pre>
     * Recommendation to add call extensions to a campaign.
     * </pre>
     *
     * <code>CALL_EXTENSION = 13;</code>
     */
    public static final int CALL_EXTENSION_VALUE = 13;
    /**
     * <pre>
     * Recommendation to change an existing keyword from one match type to a
     * broader match type.
     * </pre>
     *
     * <code>KEYWORD_MATCH_TYPE = 14;</code>
     */
    public static final int KEYWORD_MATCH_TYPE_VALUE = 14;
    /**
     * <pre>
     * Recommendation to move unused budget from one budget to a constrained
     * budget.
     * </pre>
     *
     * <code>MOVE_UNUSED_BUDGET = 15;</code>
     */
    public static final int MOVE_UNUSED_BUDGET_VALUE = 15;


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
    public static RecommendationType valueOf(int value) {
      return forNumber(value);
    }

    public static RecommendationType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return CAMPAIGN_BUDGET;
        case 3: return KEYWORD;
        case 4: return TEXT_AD;
        case 5: return TARGET_CPA_OPT_IN;
        case 6: return MAXIMIZE_CONVERSIONS_OPT_IN;
        case 7: return ENHANCED_CPC_OPT_IN;
        case 8: return SEARCH_PARTNERS_OPT_IN;
        case 9: return MAXIMIZE_CLICKS_OPT_IN;
        case 10: return OPTIMIZE_AD_ROTATION;
        case 11: return CALLOUT_EXTENSION;
        case 12: return SITELINK_EXTENSION;
        case 13: return CALL_EXTENSION;
        case 14: return KEYWORD_MATCH_TYPE;
        case 15: return MOVE_UNUSED_BUDGET;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RecommendationType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        RecommendationType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RecommendationType>() {
            public RecommendationType findValueByNumber(int number) {
              return RecommendationType.forNumber(number);
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
      return com.google.ads.googleads.v1.enums.RecommendationTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final RecommendationType[] VALUES = values();

    public static RecommendationType valueOf(
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

    private RecommendationType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v1.enums.RecommendationTypeEnum.RecommendationType)
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
    if (!(obj instanceof com.google.ads.googleads.v1.enums.RecommendationTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.enums.RecommendationTypeEnum other = (com.google.ads.googleads.v1.enums.RecommendationTypeEnum) obj;

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

  public static com.google.ads.googleads.v1.enums.RecommendationTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.RecommendationTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.RecommendationTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.RecommendationTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.RecommendationTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.RecommendationTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.RecommendationTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.RecommendationTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.RecommendationTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.RecommendationTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.RecommendationTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.RecommendationTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.enums.RecommendationTypeEnum prototype) {
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
   * Container for enum describing types of recommendations.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.enums.RecommendationTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.enums.RecommendationTypeEnum)
      com.google.ads.googleads.v1.enums.RecommendationTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.enums.RecommendationTypeProto.internal_static_google_ads_googleads_v1_enums_RecommendationTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.enums.RecommendationTypeProto.internal_static_google_ads_googleads_v1_enums_RecommendationTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.enums.RecommendationTypeEnum.class, com.google.ads.googleads.v1.enums.RecommendationTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.enums.RecommendationTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v1.enums.RecommendationTypeProto.internal_static_google_ads_googleads_v1_enums_RecommendationTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.RecommendationTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.enums.RecommendationTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.RecommendationTypeEnum build() {
      com.google.ads.googleads.v1.enums.RecommendationTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.RecommendationTypeEnum buildPartial() {
      com.google.ads.googleads.v1.enums.RecommendationTypeEnum result = new com.google.ads.googleads.v1.enums.RecommendationTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v1.enums.RecommendationTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v1.enums.RecommendationTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.enums.RecommendationTypeEnum other) {
      if (other == com.google.ads.googleads.v1.enums.RecommendationTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v1.enums.RecommendationTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.enums.RecommendationTypeEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.enums.RecommendationTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.enums.RecommendationTypeEnum)
  private static final com.google.ads.googleads.v1.enums.RecommendationTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.enums.RecommendationTypeEnum();
  }

  public static com.google.ads.googleads.v1.enums.RecommendationTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecommendationTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<RecommendationTypeEnum>() {
    @java.lang.Override
    public RecommendationTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RecommendationTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RecommendationTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecommendationTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.enums.RecommendationTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

