package controllers

import models._
import play.api.libs.json.{ Reads, Json, Writes }

trait JsonFormats {

  implicit val exerciseWrites: Writes[Exercise] = Json.writes[Exercise]

  implicit val sectionWrites: Writes[Section] = Json.writes[Section]

  implicit val libraryWrites: Writes[Library] = Json.writes[Library]

  implicit val exerciseEvaluationReads: Reads[ExerciseEvaluation] = Json.reads[ExerciseEvaluation]

}

object JsonFormats extends JsonFormats