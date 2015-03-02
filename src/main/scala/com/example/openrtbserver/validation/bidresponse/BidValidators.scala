package com.example.openrtbserver.validation.bidresponse

import com.example.openrtbserver.model.bidresponse.Bid
import com.wix.accord.dsl._

object BidValidators {

  val `price` = validator[Bid] { bid ⇒
    bid.price.as("Bid.price").should(be >= 0F)
  }

  val size = validator[Bid] { bid ⇒
    bid.w.as("Bid.w").each.should(be >= 0)
    bid.h.as("Bid.h").each.should(be >= 0)
  }

}