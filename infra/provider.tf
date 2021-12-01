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

# For push til ecr via terraform.io så fikk jeg inspirasjon fra denne
# https://registry.terraform.io/providers/hashicorp/aws/latest/docs/resources/ecr_repository

resource "aws_ecr_repository" "ecr" {
  name                 = "2004"
  image_tag_mutability = "MUTABLE"

  image_scanning_configuration {
    scan_on_push = true
  }

}