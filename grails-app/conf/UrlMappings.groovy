class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/" {
            controller = "post"
        }
		"500"(view:'/error')
	}
}
