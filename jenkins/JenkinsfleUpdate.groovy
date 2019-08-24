node {
    stage("Pull Repo") {
        git "git@github.com:csamatov96/packer_dev-.git"
    }
    stage("Build AMI") {
        sh "packer build updated/updated.json"
    }
}