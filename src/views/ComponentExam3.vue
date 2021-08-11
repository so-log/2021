<template>
    <SchoolTitle :title=title :num="30" />
    <school-title />
</template>

<script>
import SchoolTitle from '../components/SchoolTitle2.vue'
export default {
    components: { SchoolTitle },
    data() {
        return {
            title : "변경된 제목",
        };
    }
}
</script>
