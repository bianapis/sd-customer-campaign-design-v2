package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationCreateInputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignMetrics;
import org.bian.dto.CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignSpecification;
import org.bian.dto.CRCustomerCampaignSpecificationUpdateInputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationUpdateInputModelCustomerCampaignSpecificationInstanceRecord
 */
public class CRCustomerCampaignSpecificationUpdateInputModelCustomerCampaignSpecificationInstanceRecord   {
  private String customerCampaignType = null;

  private String customerCampaignDescription = null;

  private CRCustomerCampaignSpecificationCreateInputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignMetrics customerCampaignMetrics = null;

  private CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignSpecification customerCampaignSpecification = null;

  private CRCustomerCampaignSpecificationUpdateInputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord customerCampaignPerformanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type or category of customer campaign (e.g. cross-sell, up-sell, retention) 
   * @return customerCampaignType
  **/

  public String getCustomerCampaignType() {
    return customerCampaignType;
  }

  public void setCustomerCampaignType(String customerCampaignType) {
    this.customerCampaignType = customerCampaignType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the campaign that clarifies the intended context/use of the campaign, the mechanisms employed and the intended/anticipated response/impact 
   * @return customerCampaignDescription
  **/

  public String getCustomerCampaignDescription() {
    return customerCampaignDescription;
  }

  public void setCustomerCampaignDescription(String customerCampaignDescription) {
    this.customerCampaignDescription = customerCampaignDescription;
  }


  /**
   * Get customerCampaignMetrics
   * @return customerCampaignMetrics
  **/

  public CRCustomerCampaignSpecificationCreateInputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignMetrics getCustomerCampaignMetrics() {
    return customerCampaignMetrics;
  }

  public void setCustomerCampaignMetrics(CRCustomerCampaignSpecificationCreateInputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignMetrics customerCampaignMetrics) {
    this.customerCampaignMetrics = customerCampaignMetrics;
  }


  /**
   * Get customerCampaignSpecification
   * @return customerCampaignSpecification
  **/

  public CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignSpecification getCustomerCampaignSpecification() {
    return customerCampaignSpecification;
  }

  public void setCustomerCampaignSpecification(CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignSpecification customerCampaignSpecification) {
    this.customerCampaignSpecification = customerCampaignSpecification;
  }


  /**
   * Get customerCampaignPerformanceRecord
   * @return customerCampaignPerformanceRecord
  **/

  public CRCustomerCampaignSpecificationUpdateInputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord getCustomerCampaignPerformanceRecord() {
    return customerCampaignPerformanceRecord;
  }

  public void setCustomerCampaignPerformanceRecord(CRCustomerCampaignSpecificationUpdateInputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord customerCampaignPerformanceRecord) {
    this.customerCampaignPerformanceRecord = customerCampaignPerformanceRecord;
  }


}

