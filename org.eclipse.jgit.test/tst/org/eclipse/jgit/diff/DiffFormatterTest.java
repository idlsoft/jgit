		DiffFormatter df = new DiffFormatter(new SafeBufferedOutputStream(os));
		df.setRepository(db);
		df.setPathFilter(PathFilter.create("folder"));
		df.format(oldTree, newTree);
		df.flush();