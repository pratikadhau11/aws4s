package org.aws4s.sqs

import org.aws4s.core.ParamValidator
import cats.implicits._

case class MessageId(raw: String)
    extends SqsParam[String](
      "MessageId",
      ParamValidator.noValidation
    )
