package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustomerCampaignDesignRetrieveInputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDCustomerCampaignDesignRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis;
import org.bian.dto.SDCustomerCampaignDesignRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDCustomerCampaignDesignRetrieveInputModelServiceDomainRetrieveActionRecord
 */
public class SDCustomerCampaignDesignRetrieveInputModelServiceDomainRetrieveActionRecord   {
  private SDCustomerCampaignDesignRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis serviceDomainActivityAnalysis = null;

  private SDCustomerCampaignDesignRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis = null;

  private SDCustomerCampaignDesignRetrieveInputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get serviceDomainActivityAnalysis
   * @return serviceDomainActivityAnalysis
  **/

  public SDCustomerCampaignDesignRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis getServiceDomainActivityAnalysis() {
    return serviceDomainActivityAnalysis;
  }

  public void setServiceDomainActivityAnalysis(SDCustomerCampaignDesignRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis serviceDomainActivityAnalysis) {
    this.serviceDomainActivityAnalysis = serviceDomainActivityAnalysis;
  }


  /**
   * Get serviceDomainPerformanceAnalysis
   * @return serviceDomainPerformanceAnalysis
  **/

  public SDCustomerCampaignDesignRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis getServiceDomainPerformanceAnalysis() {
    return serviceDomainPerformanceAnalysis;
  }

  public void setServiceDomainPerformanceAnalysis(SDCustomerCampaignDesignRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis) {
    this.serviceDomainPerformanceAnalysis = serviceDomainPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCustomerCampaignDesignRetrieveInputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCustomerCampaignDesignRetrieveInputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

