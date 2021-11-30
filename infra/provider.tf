terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "3.56.0"
    }
  }
  backend "s3" {
    bucket = "pgr301-2004-terraform"
    key    = "chli009/terraform_2021_pgr301_kandidat_2004.state"
    region = "eu-west-1"
  }

}
provider "aws" {
  profile = "default"
  region  = "eu-west-1"
}

resource "aws_ecr_repository" "ecr" {
  name                 = "2004"
  image_tag_mutability = "MUTABLE"

  image_scanning_configuration {
    scan_on_push = true
  }

  tags = {
    name = "ecr"
  }

}