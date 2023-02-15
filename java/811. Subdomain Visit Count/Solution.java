class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {

        Map<String, Integer> visits = new HashMap<>();

        for (String cpdomain : cpdomains) {
            Map<String, Integer> counts = getAllVisits(cpdomain);
            for (String domain : counts.keySet()) {
                visits.put(domain, visits.getOrDefault(domain, 0) + counts.get(domain));
            }
        }

        return createVisitedList(visits);
    }

    public Map<String, Integer> getAllVisits(String cpdomain) {
        Map<String, Integer> counts = new HashMap<>();

        String[] tokens = cpdomain.split(" ");
        Integer count = Integer.valueOf(tokens[0]);
        String domain = tokens[1];

        counts.put(domain, count);

        domain = domain.substring(domain.indexOf('.') + 1, domain.length());
        counts.put(domain, count);

        if (domain.indexOf('.') != -1) {
            domain = domain.substring(domain.indexOf('.') + 1, domain.length());
            counts.put(domain, count);
        }

        return counts;
    }

    public List<String> createVisitedList(Map<String, Integer> counts) {
        List<String> visits = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (String domain : counts.keySet()) {
            visits.add(sb.append(String.valueOf(counts.get(domain))).append(" ").append(domain).toString());
            sb.setLength(0);
        }
        return visits;
    }

}