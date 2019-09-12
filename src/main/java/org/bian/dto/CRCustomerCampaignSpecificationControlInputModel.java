package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationControlInputModelCustomerCampaignSpecificationControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationControlInputModel
 */
public class CRCustomerCampaignSpecificationControlInputModel   {
  private String customerCampaignDesignServicingSessionReference = null;

  private String customerCampaignSpecificationInstanceReference = null;

  private Object customerCampaignSpecificationControlActionTaskRecord = null;

  private CRCustomerCampaignSpecificationControlInputModelCustomerCampaignSpecificationControlActionRequest customerCampaignSpecificationControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerCampaignSpecificationControlActionTaskRecord
  **/

  public Object getCustomerCampaignSpecificationControlActionTaskRecord() {
    return customerCampaignSpecificationControlActionTaskRecord;
  }

  public void setCustomerCampaignSpecificationControlActionTaskRecord(Object customerCampaignSpecificationControlActionTaskRecord) {
    this.customerCampaignSpecificationControlActionTaskRecord = customerCampaignSpecificationControlActionTaskRecord;
  }


  /**
   * Get customerCampaignSpecificationControlActionRequest
   * @return customerCampaignSpecificationControlActionRequest
  **/

  public CRCustomerCampaignSpecificationControlInputModelCustomerCampaignSpecificationControlActionRequest getCustomerCampaignSpecificationControlActionRequest() {
    return customerCampaignSpecificationControlActionRequest;
  }

  public void setCustomerCampaignSpecificationControlActionRequest(CRCustomerCampaignSpecificationControlInputModelCustomerCampaignSpecificationControlActionRequest customerCampaignSpecificationControlActionRequest) {
    this.customerCampaignSpecificationControlActionRequest = customerCampaignSpecificationControlActionRequest;
  }


}

