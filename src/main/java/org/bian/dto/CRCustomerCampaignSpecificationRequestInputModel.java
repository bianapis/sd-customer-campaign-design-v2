package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationRequestInputModelCustomerCampaignSpecificationInstanceRecord;
import org.bian.dto.CRCustomerCampaignSpecificationRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationRequestInputModel
 */
public class CRCustomerCampaignSpecificationRequestInputModel   {
  private String customerCampaignDesignServicingSessionReference = null;

  private String customerCampaignSpecificationInstanceReference = null;

  private CRCustomerCampaignSpecificationRequestInputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord = null;

  private Object customerCampaignSpecificationRequestActionTaskRecord = null;

  private CRCustomerCampaignSpecificationRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRCustomerCampaignSpecificationRequestInputModelCustomerCampaignSpecificationInstanceRecord getCustomerCampaignSpecificationInstanceRecord() {
    return customerCampaignSpecificationInstanceRecord;
  }

  public void setCustomerCampaignSpecificationInstanceRecord(CRCustomerCampaignSpecificationRequestInputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord) {
    this.customerCampaignSpecificationInstanceRecord = customerCampaignSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerCampaignSpecificationRequestActionTaskRecord
  **/

  public Object getCustomerCampaignSpecificationRequestActionTaskRecord() {
    return customerCampaignSpecificationRequestActionTaskRecord;
  }

  public void setCustomerCampaignSpecificationRequestActionTaskRecord(Object customerCampaignSpecificationRequestActionTaskRecord) {
    this.customerCampaignSpecificationRequestActionTaskRecord = customerCampaignSpecificationRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerCampaignSpecificationRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerCampaignSpecificationRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

