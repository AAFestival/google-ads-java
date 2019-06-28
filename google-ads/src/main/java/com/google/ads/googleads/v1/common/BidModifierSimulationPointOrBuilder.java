// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/simulation.proto

package com.google.ads.googleads.v1.common;

public interface BidModifierSimulationPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.common.BidModifierSimulationPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The simulated bid modifier upon which projected metrics are based.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bid_modifier = 1;</code>
   */
  boolean hasBidModifier();
  /**
   * <pre>
   * The simulated bid modifier upon which projected metrics are based.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bid_modifier = 1;</code>
   */
  com.google.protobuf.DoubleValue getBidModifier();
  /**
   * <pre>
   * The simulated bid modifier upon which projected metrics are based.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bid_modifier = 1;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getBidModifierOrBuilder();

  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions = 2;</code>
   */
  boolean hasBiddableConversions();
  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions = 2;</code>
   */
  com.google.protobuf.DoubleValue getBiddableConversions();
  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions = 2;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getBiddableConversionsOrBuilder();

  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions_value = 3;</code>
   */
  boolean hasBiddableConversionsValue();
  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions_value = 3;</code>
   */
  com.google.protobuf.DoubleValue getBiddableConversionsValue();
  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions_value = 3;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getBiddableConversionsValueOrBuilder();

  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value clicks = 4;</code>
   */
  boolean hasClicks();
  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value clicks = 4;</code>
   */
  com.google.protobuf.Int64Value getClicks();
  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value clicks = 4;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getClicksOrBuilder();

  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cost_micros = 5;</code>
   */
  boolean hasCostMicros();
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cost_micros = 5;</code>
   */
  com.google.protobuf.Int64Value getCostMicros();
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cost_micros = 5;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCostMicrosOrBuilder();

  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value impressions = 6;</code>
   */
  boolean hasImpressions();
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value impressions = 6;</code>
   */
  com.google.protobuf.Int64Value getImpressions();
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value impressions = 6;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getImpressionsOrBuilder();

  /**
   * <pre>
   * Projected number of top slot impressions.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value top_slot_impressions = 7;</code>
   */
  boolean hasTopSlotImpressions();
  /**
   * <pre>
   * Projected number of top slot impressions.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value top_slot_impressions = 7;</code>
   */
  com.google.protobuf.Int64Value getTopSlotImpressions();
  /**
   * <pre>
   * Projected number of top slot impressions.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value top_slot_impressions = 7;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getTopSlotImpressionsOrBuilder();

  /**
   * <pre>
   * Projected number of biddable conversions for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue parent_biddable_conversions = 8;</code>
   */
  boolean hasParentBiddableConversions();
  /**
   * <pre>
   * Projected number of biddable conversions for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue parent_biddable_conversions = 8;</code>
   */
  com.google.protobuf.DoubleValue getParentBiddableConversions();
  /**
   * <pre>
   * Projected number of biddable conversions for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue parent_biddable_conversions = 8;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getParentBiddableConversionsOrBuilder();

  /**
   * <pre>
   * Projected total value of biddable conversions for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue parent_biddable_conversions_value = 9;</code>
   */
  boolean hasParentBiddableConversionsValue();
  /**
   * <pre>
   * Projected total value of biddable conversions for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue parent_biddable_conversions_value = 9;</code>
   */
  com.google.protobuf.DoubleValue getParentBiddableConversionsValue();
  /**
   * <pre>
   * Projected total value of biddable conversions for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue parent_biddable_conversions_value = 9;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getParentBiddableConversionsValueOrBuilder();

  /**
   * <pre>
   * Projected number of clicks for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_clicks = 10;</code>
   */
  boolean hasParentClicks();
  /**
   * <pre>
   * Projected number of clicks for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_clicks = 10;</code>
   */
  com.google.protobuf.Int64Value getParentClicks();
  /**
   * <pre>
   * Projected number of clicks for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_clicks = 10;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getParentClicksOrBuilder();

  /**
   * <pre>
   * Projected cost in micros for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_cost_micros = 11;</code>
   */
  boolean hasParentCostMicros();
  /**
   * <pre>
   * Projected cost in micros for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_cost_micros = 11;</code>
   */
  com.google.protobuf.Int64Value getParentCostMicros();
  /**
   * <pre>
   * Projected cost in micros for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_cost_micros = 11;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getParentCostMicrosOrBuilder();

  /**
   * <pre>
   * Projected number of impressions for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_impressions = 12;</code>
   */
  boolean hasParentImpressions();
  /**
   * <pre>
   * Projected number of impressions for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_impressions = 12;</code>
   */
  com.google.protobuf.Int64Value getParentImpressions();
  /**
   * <pre>
   * Projected number of impressions for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_impressions = 12;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getParentImpressionsOrBuilder();

  /**
   * <pre>
   * Projected number of top slot impressions for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_top_slot_impressions = 13;</code>
   */
  boolean hasParentTopSlotImpressions();
  /**
   * <pre>
   * Projected number of top slot impressions for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_top_slot_impressions = 13;</code>
   */
  com.google.protobuf.Int64Value getParentTopSlotImpressions();
  /**
   * <pre>
   * Projected number of top slot impressions for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_top_slot_impressions = 13;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getParentTopSlotImpressionsOrBuilder();
}
