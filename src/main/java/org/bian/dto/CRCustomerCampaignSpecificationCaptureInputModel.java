package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationCaptureInputModelCaptureRecordType;
import org.bian.dto.CRCustomerCampaignSpecificationCaptureInputModelCustomerCampaignSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationCaptureInputModel
 */
public class CRCustomerCampaignSpecificationCaptureInputModel   {
  private String customerCampaignDesignServicingSessionReference = null;

  private String customerCampaignSpecificationInstanceReference = null;

  private CRCustomerCampaignSpecificationCaptureInputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord = null;

  private Object customerCampaignSpecificationCaptureActionTaskRecord = null;

  private CRCustomerCampaignSpecificationCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerCampaignDesignServicingSessionReference
  **/

  public String getCustomerCampaignDesignServicingSessionReference() {
    return customerCampaignDesignServicingSessionReference;
  }

  public void setCustomerCampaignDesignServicingSessionReference(String customerCampaignDesignServicingSessionReference) {
    this.customerCampaignDesignServicingSessionReference = customerCampaignDesignServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Campaign Specification instance 
   * @return customerCampaignSpecificationInstanceReference
  **/

  public String getCustomerCampaignSpecificationInstanceReference() {
    return customerCampaignSpecificationInstanceReference;
  }

  public void setCustomerCampaignSpecificationInstanceReference(String customerCampaignSpecificationInstanceReference) {
    this.customerCampaignSpecificationInstanceReference = customerCampaignSpecificationInstanceReference;
  }


  /**
   * Get customerCampaignSpecificationInstanceRecord
   * @return customerCampaignSpecificationInstanceRecord
  **/

  public CRCustomerCampaignSpecificationCaptureInputModelCustomerCampaignSpecificationInstanceRecord getCustomerCampaignSpecificationInstanceRecord() {
    return customerCampaignSpecificationInstanceRecord;
  }

  public void setCustomerCampaignSpecificationInstanceRecord(CRCustomerCampaignSpecificationCaptureInputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord) {
    this.customerCampaignSpecificationInstanceRecord = customerCampaignSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return customerCampaignSpecificationCaptureActionTaskRecord
  **/

  public Object getCustomerCampaignSpecificationCaptureActionTaskRecord() {
    return customerCampaignSpecificationCaptureActionTaskRecord;
  }

  public void setCustomerCampaignSpecificationCaptureActionTaskRecord(Object customerCampaignSpecificationCaptureActionTaskRecord) {
    this.customerCampaignSpecificationCaptureActionTaskRecord = customerCampaignSpecificationCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public CRCustomerCampaignSpecificationCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(CRCustomerCampaignSpecificationCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

